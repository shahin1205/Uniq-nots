package Daemon2package;


class Food
{
    int x;
    public Food(int x)
    {
        this.x = x;
    }

    public synchronized void buy(int count)
    {

        System.out.println(Thread.currentThread().getName()+" before buying stock : "+ x);
        System.out.println(Thread.currentThread().getName()+" - wants to buy "+count);
        if(x >= count) //
        {
            System.out.println("booking conform -" + Thread.currentThread().getName());
            x -= count;
        }
    }

    public void addStock()
    {
        x += 10;
    }
}


class Thread1 extends Thread
{
    private Food food;

    public Thread1(Food food)
    {
        this.food = food;
    }

    @Override
    public void run()
    {
        while (true)
        {
            if(food.x <= 6) // x <= 6
            {

                food.addStock();
                System.out.println("stock update....");
            }
        }
    }
}


class Person extends Thread
{
    private Food food;
    private int count;

    public Person(Food food,int count)
    {
        this.food = food;
        this.count = count;
    }

    @Override
    public void run() {
        food.buy(this.count);
    }
}


public class Daemon2 {
    public static void main(String[] args) {

        Food f1 = new Food(10);

        Person person1 = new Person(f1, 5);
        Person person2 = new Person(f1, 3);
        Person person3 = new Person(f1, 2);
        Person person4 = new Person(f1, 4);

        Thread1 t1 = new Thread1(f1);
        t1.setDaemon(true);
        t1.start();


        person1.setName("person1");
        person2.setName("person2");
        person3.setName("person3");
        person4.setName("person4");

        person1.start();
        person2.start();
        person3.start();
        person4.start();


    }
}
