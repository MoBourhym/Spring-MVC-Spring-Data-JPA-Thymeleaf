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

        patientRpository.save(patient);

        Patient patient2 = new Patient(null, "Yasmine", new Date(), false, 123);

        patientRpository.save(patient2);
        Patient patient3 = new Patient(null, "Kora", new Date(), true, 541);


        patientRpository.save(patient3);
        Patient patint4 = Patient.builder().nom("John Dawd").dateNaissance(new Date()).build();
        patientRpository.save(patint4);
    }

}
