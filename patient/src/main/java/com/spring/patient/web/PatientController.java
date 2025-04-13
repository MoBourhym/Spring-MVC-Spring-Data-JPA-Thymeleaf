package com.spring.patient.web;


import com.spring.patient.repository.PatientRpository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class PatientController {
    @Autowired
    private PatientRpository patientRpository;

    @GetMapping("/idex")
    public String index() {
        return "patients";
    }

}
