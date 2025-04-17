package com.spring.patient.web;


import com.spring.patient.entities.Patient;
import com.spring.patient.repository.PatientRpository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRpository patientRpository;

    @GetMapping("/index")
    public String index(Model model) {
        Page<Patient> patientList = patientRpository.findAll(PageRequest.of(0,4));
        model.addAttribute("listPatients",patientList.getContent());
        return "patients";
    }

}
