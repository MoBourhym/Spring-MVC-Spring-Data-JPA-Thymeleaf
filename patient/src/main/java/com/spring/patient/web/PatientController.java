package com.spring.patient.web;


import com.spring.patient.entities.Patient;
import com.spring.patient.repository.PatientRpository;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRpository patientRpository;

    @GetMapping("/index")
    public String index(Model model , @RequestParam(name="page",defaultValue = "0") int p , @RequestParam(name="size",defaultValue = "4") int s,@RequestParam(name="keyword",defaultValue = "") String kw) {
        Page<Patient>  pagePatients = patientRpository.findByNomContains(kw,PageRequest.of(p,s));
        model.addAttribute("ListPatients",pagePatients.getContent());
        model.addAttribute("listPatients",pagePatients.getContent());
        model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
        model.addAttribute("keyword",kw);
        return "patients";
    }

}
