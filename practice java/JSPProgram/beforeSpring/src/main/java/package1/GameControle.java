package package1;

interface ControllerInterface{
    public void goToFront();
    public void goToBack();
    public void goToRight();
    public void goToLift();
}

class PubG implements ControllerInterface{
    public void goToFront(){
        System.out.println("goToFront");
    }
    public void goToBack(){
        System.out.println("goToBack");
    }
    public void goToRight(){
        System.out.println("goToRight");
    }
    public void goToLift(){
        System.out.println("goToLift");
    }
}
class FreeFire implements ControllerInterface{
    public void goToFront(){
        System.out.println("goToFront");
    }
    public void goToBack(){
        System.out.println("goToBack");
    }
    public void goToRight(){
        System.out.println("goToRight");
    }
    public void goToLift(){
        System.out.println("goToLift");
    }
}

class  Controller{
    ControllerInterface controller;

    Controller(ControllerInterface controller){
        this.controller=controller;
    }
    public  void controllerMethod(){
        controller.goToFront();
        controller.goToBack();
        controller.goToLift();
        controller.goToRight();
    }

}

public class GameControle {
    public static void main(String[] args) {
        FreeFire freeFire=new FreeFire();
        PubG pubG=new PubG();

        Controller controller=new Controller(freeFire);
        controller.controllerMethod();
    }
}