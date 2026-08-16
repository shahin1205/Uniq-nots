package package1;


class SharedData {
    int number;
}

class Thread1 extends Thread {
    SharedData data;

    Thread1(SharedData data) {
        this.data = data;
    }

    public void run() {
        data.number = 100;
    }
}

class Thread2 extends Thread {
    SharedData data;

    Thread2(SharedData data) {
        this.data = data;
    }

    public void run() {

        System.out.println(data.number);
    }
}
public class practice5 {
    public static void main(String[] args) {
        SharedData data=new SharedData();
        Thread1 t1=new Thread1(data);
        t1.start();
        Thread2 t2=new Thread2(data);
        t2.start();

    }
}
