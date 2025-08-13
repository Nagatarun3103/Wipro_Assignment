document.addEventListener("DOMContentLoaded", () => {
  const form = document.getElementById("rtoForm");
  const submitBtn = document.getElementById("submitBtn");
  const progressBar = document.getElementById("formProgress");
  const captchaLabel = document.getElementById("captchaLabel");
  const captchaInput = document.getElementById("captchaInput");
  const hypothecation = document.getElementById("hypothecation");
  const financeDetails = document.getElementById("financeDetails");
  const terms = document.getElementById("terms");
  let captchaAnswer = 0;

  function generateCaptcha() {
    const a = Math.floor(Math.random() * 10) + 1;
    const b = Math.floor(Math.random() * 10) + 1;
    captchaAnswer = a + b;
    captchaLabel.textContent = `What is ${a} + ${b}?`;
  }

  function updateProgress() {
    const totalRequired = form.querySelectorAll("[required]").length;
    const validCount = form.querySelectorAll(".is-valid").length;
    const progress = Math.round((validCount / totalRequired) * 100);
    progressBar.style.width = `${progress}%`;
    progressBar.innerText = `${progress}%`;
    submitBtn.disabled = progress < 100 || !terms.checked || parseInt(captchaInput.value) !== captchaAnswer;
  }

  function validateDOB(input) {
    const dob = new Date(input.value);
    const today = new Date();
    let age = today.getFullYear() - dob.getFullYear();
    const m = today.getMonth() - dob.getMonth();
    if (m < 0 || (m === 0 && today.getDate() < dob.getDate())) age--;
    return age >= 18;
  }

  function validateDates(input) {
    const today = new Date().toISOString().split("T")[0];
    if (input.name === "purchaseDate") return input.value <= today;
    if (input.name === "insuranceExpiry" || input.name === "pucExpiry") return input.value >= today;
    return true;
  }

  function validateFile(input) {
    if (!input.files.length) return false;
    const file = input.files[0];
    const validTypes = [".pdf", ".jpg", ".jpeg", ".png"];
    const ext = file.name.slice(file.name.lastIndexOf(".")).toLowerCase();
    return validTypes.includes(ext) && file.size <= 2 * 1024 * 1024;
  }

  form.querySelectorAll("input, select").forEach(input => {
    input.addEventListener("input", () => {
      if (input.type === "date" && input.name === "dob") {
        input.setCustomValidity(validateDOB(input) ? "" : "Invalid");
      }
      if (input.type === "date" && ["purchaseDate", "insuranceExpiry", "pucExpiry"].includes(input.name)) {
        input.setCustomValidity(validateDates(input) ? "" : "Invalid");
      }
      if (input.type === "file") {
        input.setCustomValidity(validateFile(input) ? "" : "Invalid");
      }
      if (input.checkValidity()) {
        input.classList.add("is-valid");
        input.classList.remove("is-invalid");
      } else {
        input.classList.add("is-invalid");
        input.classList.remove("is-valid");
      }
      updateProgress();
    });
  });

  hypothecation.addEventListener("change", () => {
    financeDetails.classList.toggle("d-none", !hypothecation.checked);
    financeDetails.querySelectorAll("input").forEach(inp => {
      if (hypothecation.checked) {
        inp.required = true;
      } else {
        inp.required = false;
        inp.classList.remove("is-valid", "is-invalid");
      }
    });
    updateProgress();
  });

  terms.addEventListener("change", updateProgress);
  captchaInput.addEventListener("input", updateProgress);

  form.addEventListener("submit", e => {
    e.preventDefault();
    if (!form.checkValidity() || parseInt(captchaInput.value) !== captchaAnswer) return;
    const toast = new bootstrap.Toast(document.getElementById("successToast"));
    toast.show();
    form.reset();
    form.querySelectorAll(".is-valid, .is-invalid").forEach(el => el.classList.remove("is-valid", "is-invalid"));
    financeDetails.classList.add("d-none");
    generateCaptcha();
    updateProgress();
  });

  generateCaptcha();
});
