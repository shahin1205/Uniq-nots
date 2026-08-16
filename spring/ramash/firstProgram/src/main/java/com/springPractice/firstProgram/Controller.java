package com.springPractice.firstProgram;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// l
@Component

public class Controller {
    @Autowired
     @Qualifier("pubG")
    ControllerInterface controller;
//Controller (ControllerInterface controller){
//    this.controller=controller;
//}

    public  void controllerMethod(){
        controller.goToFront();
        controller.goToBack();
        controller.goToLift();
        controller.goToRight();
    }

}
