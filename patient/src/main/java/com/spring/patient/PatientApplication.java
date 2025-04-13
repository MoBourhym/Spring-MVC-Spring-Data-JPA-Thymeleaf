package com.spring.patient;

import com.spring.patient.entities.Patient;
import com.spring.patient.repository.PatientRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientApplication implements CommandLineRunner {
    @Autowired
    private PatientRpository patientRpository;


    public static void main(String[] args) {
        SpringApplication.run(PatientApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


        Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("John Doe");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(20);

    }

}
