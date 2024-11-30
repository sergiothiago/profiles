package com.profiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class ExampleController {


    @Autowired
    private String profileSpecificBean;


    /**
     * Exemplo Profile
     * @return
     */
    @GetMapping
    public String exampleProfile(){


        return profileSpecificBean;
    }


}
