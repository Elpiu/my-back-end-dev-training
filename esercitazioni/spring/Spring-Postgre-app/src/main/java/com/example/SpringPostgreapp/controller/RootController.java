package com.example.SpringPostgreapp.controller;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;


@Hidden
@RestController
@RequestMapping("/")
public class RootController {

    @RequestMapping("/")
    public RedirectView rootMap(){
        return new RedirectView("/swagger-ui/index.html");
    }
}
