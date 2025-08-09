package com.javadeveloperzone.controller;

import com.javadeveloperzone.model.Enrollment_form;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("enrollment_form", new Enrollment_form());
        return "form";  // form.html
    }

    @PostMapping("/submitForm")
    public String submitForm(@Valid @ModelAttribute("enrollment_form") Enrollment_form form,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        return "success"; // Create success.html
    }
}
