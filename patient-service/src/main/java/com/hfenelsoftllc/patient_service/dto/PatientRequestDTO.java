package com.hfenelsoftllc.patient_service.dto;

import java.time.LocalDate;

public class PatientRequestDTO {
    private String name;    
    private String email;   
    private String address;
    private LocalDate dateOfBirth;
    private LocalDate registeredDate;

    public PatientRequestDTO() {
    }

    public PatientRequestDTO(String name, String email, String address, LocalDate dateOfBirth, LocalDate registeredDate) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.registeredDate = registeredDate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setLastName(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
