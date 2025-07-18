package com.hfenelsoftllc.patient_service.service;

import java.util.List;

import org.hibernate.validator.constraints.UUID;
import org.springframework.stereotype.Service;

import com.hfenelsoftllc.patient_service.dto.PatientResponseDTO;
import com.hfenelsoftllc.patient_service.mapper.PatientMapper;
import com.hfenelsoftllc.patient_service.model.Patient;
import com.hfenelsoftllc.patient_service.repository.PatientRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // Add methods to handle patient operations, e.g., create, update, delete, find
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }
    public Patient getPatient(UUID id) {
        return patientRepository.findById(id).orElse(null);
    }
    public void deletePatient(UUID id) {
        patientRepository.deleteById(id);
    }
    public List<PatientResponseDTO> getAllPatients() {
        List<Patient> patients =  patientRepository.findAll();

        if (patients.isEmpty()) {
            throw new EntityNotFoundException("No patients found");
        }
        return patients.stream()
                .map(PatientMapper::toDto).toList();  // short hand lambda function
        //return patientDtos;
    }

    
    public void updatePatient(Patient patient) {
        if (patientRepository.existsById(patient.getId())) {
            patientRepository.save(patient);
        } else {
            throw new EntityNotFoundException("Patient not found with id: " + patient.getId());
        }
    }

}
