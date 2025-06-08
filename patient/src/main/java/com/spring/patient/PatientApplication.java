package com.spring.patient;

import com.spring.patient.entities.Patient;
import com.spring.patient.repository.PatientRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.Date;

@SpringBootApplication
public class PatientApplication {
    @Autowired
    private PatientRpository patientRpository;


    public static void main(String[] args) {
        SpringApplication.run(PatientApplication.class, args);
    }


    @Bean
    CommandLineRunner start(PatientRpository patientRepository) {
        return args -> {
            patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 42));
            patientRepository.save(new Patient(null, "Imane", new Date(), true, 98));
            patientRepository.save(new Patient(null, "Yassine", new Date(), true, 342));
            patientRepository.save(new Patient(null, "Laila", new Date(), false, 123));
        };
    }


    @Bean
    CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager, PasswordEncoder passwordEncoder){
        return args -> {
            try {
                UserDetails user1 = jdbcUserDetailsManager.loadUserByUsername("user1");
            } catch (Exception e) {
                jdbcUserDetailsManager.createUser(
                        User.withUsername("user1").password(passwordEncoder.encode("5678")).roles("USER").build()
                );
            }
            
            try {
                UserDetails admin = jdbcUserDetailsManager.loadUserByUsername("admin");
            } catch (Exception e) {
                jdbcUserDetailsManager.createUser(
                        User.withUsername("admin").password(passwordEncoder.encode("56789")).roles("ADMIN").build()
                );
            }
        };
    }

    ;
}




