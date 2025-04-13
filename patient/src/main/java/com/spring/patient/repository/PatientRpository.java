package com.spring.patient.repository;

import com.spring.patient.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRpository extends JpaRepository<Patient, Long> {


}
