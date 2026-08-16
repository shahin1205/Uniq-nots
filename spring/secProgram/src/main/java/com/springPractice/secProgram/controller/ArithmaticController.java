package com.springPractice.secProgram.controller;


import com.springPractice.secProgram.service.ArithmaticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/controller")
public class ArithmaticController {

    @Autowired
    ArithmaticService service;

    ArithmaticController(ArithmaticService service){
        this.service=service;
    }


    @GetMapping("/add")
    public int add(){
        return service.add();
    }

    @GetMapping("/sub")
    public int sub(){
        return service.sub();
    }


}
