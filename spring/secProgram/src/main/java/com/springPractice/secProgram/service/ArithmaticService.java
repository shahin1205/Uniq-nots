package com.springPractice.secProgram.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmaticService {

    public int add(){

        int a=12;
        int b=56;

        return  a+b;
    }

    public int sub(){
        int a=12;
        int b=56;
        return a-b;
    }
}
