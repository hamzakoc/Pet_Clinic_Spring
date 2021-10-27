package pet_clinic_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {


    @RequestMapping({"","/","/index", "/index.html"})
    public String listVet(){
        return "vet/index";
    }



}
