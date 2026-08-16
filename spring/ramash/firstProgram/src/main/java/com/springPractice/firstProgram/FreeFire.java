package com.springPractice.firstProgram;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("FreeFire")
@Primary
public class FreeFire implements ControllerInterface {
    @Override
    public void goToFront(){
        System.out.println("go To Front free fire");
    }
    @Override
    public void goToBack(){
        System.out.println("go To Back free fire");
    }
    @Override
    public void goToRight(){
        System.out.println("go To Right free fire");
    }
    @Override
    public void goToLift(){
        System.out.println("go To Lift free fire");
    }
}
