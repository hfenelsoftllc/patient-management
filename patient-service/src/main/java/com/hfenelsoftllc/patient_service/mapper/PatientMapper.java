package com.hfenelsoftllc.patient_service.mapper;

import com.hfenelsoftllc.patient_service.dto.PatientResponseDTO;
import com.hfenelsoftllc.patient_service.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDto(Patient patient) {
        if (patient == null) {
            return null;
        }
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(patient.getId().toString());
        dto.setName(patient.getName());
        dto.setEmail(patient.getEmail());
        dto.setAddress(patient.getAddress());
        dto.setDateOfBirth(patient.getDateOfBirth());
        dto.setRegisteredDate(patient.getRegisteredDate());
        return dto;
    }

    

}
