package packeg1;

class vehicle {
    int cycle() {
        System.out.println("tow weeler and three weeler");
        return 0;
    }

    void cycle(int a, int b) {
        System.out.println(a + b + "weeler");
    }

    public void cycle(int a, int b, int c) {
        System.out.println(a + b + c + "weeler");
    }
}
public class polimorphism {
    public static void main(String[] args) {
        vehicle ob=new vehicle();
        ob.cycle();
        ob.cycle(1,1);
        ob.cycle(1,1,1);

    }
}
