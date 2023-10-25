package oops;
abstract class vechile{
    int no_of_tyres;
    abstract void start();
}
class scooter extends vechile{

    @Override
    void start() {
        System.out.println("Starts with kick");
    }
}

class car extends vechile{

    @Override
    void start() {
        System.out.println("Starts with key");
    }
}

public class abstraction {
    public static void main(String[] args) {
        scooter sc = new scooter();
        car c = new car();
        sc.start();
        c.start();
    }
}
