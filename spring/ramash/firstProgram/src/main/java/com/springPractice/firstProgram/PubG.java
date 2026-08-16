package com.springPractice.firstProgram;

import org.springframework.stereotype.Component;

@Component("pubG")

public class PubG implements ControllerInterface {
    @Override
    public void goToFront(){
        System.out.println("go To Front pubG");
    }
    @Override
    public void goToBack(){
        System.out.println("go To Back pubG");
    }
    public void goToRight(){
        System.out.println("go To Right pubG");
    }
    public void goToLift(){
        System.out.println("go To Lift pubG");
    }
}
