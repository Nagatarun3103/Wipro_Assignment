package com.javadeveloperzone.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Enrollment_form {

    @NotBlank(message = "{firstName.notblank}")
    @Size(min = 3, max = 30, message = "{firstName.size}")
    private String firstName;

    @NotBlank(message = "{lastName.notblank}")
    @Size(min = 3, max = 30, message = "{lastName.size}")
    private String lastName;

    @NotNull(message = "{gender.notnull}")
    private String gender;

    @NotBlank(message = "{dob.notblank}")
    private String dob;

    @Email(message = "{email.invalid}")
    @NotBlank(message = "{email.notblank}")
    private String email;

    @NotBlank(message = "{section.notblank}")
    private String section;

    @NotBlank(message = "{country.notblank}")
    private String country;

    @NotNull(message = "{subjects.notnull}")
    @Size(min = 1, message = "{subjects.size}")
    private List<String> subjects;

    // ✅ Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
