package com.spring.patient.repository;

import com.spring.patient.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PatientRpository extends JpaRepository<Patient, Long> {

Page<Patient> findByNomContains(String keyword, Pageable pageable);
@Query("select p from Patient p where p.nom like :x")
    Page<Patient> findByNom(@Param("x") String x, Pageable pageable);
}
