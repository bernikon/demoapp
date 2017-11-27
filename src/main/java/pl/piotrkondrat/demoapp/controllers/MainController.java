package pl.piotrkondrat.demoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.piotrkondrat.demoapp.models.services.StringService;

@Controller
public class MainController {


    @Autowired
    StringService stringService;

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "Czesc! " + stringService.generateRandomString();

    }
}
