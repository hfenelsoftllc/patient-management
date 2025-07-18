package com.hfenelsoftllc.patient_service.repository;

import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hfenelsoftllc.patient_service.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {

    boolean existsById(java.util.UUID id);


}
