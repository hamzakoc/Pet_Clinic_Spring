package pet_clinic_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owner")
@Controller
public class OwnerController {


    @RequestMapping({"","/","/index", "/index.html"})
    public String listOwner(){
        return "owner/index";
    }


}
