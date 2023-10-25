package oops;
class Animal{
    int age;
    String Color;

    public   Animal(String Color, int age){
        this.Color = Color;
        this.age = age;
    }

    public Animal() {

    }

    void eat(){
        System.out.println("I am eating");
    }

    void run(){
        System.out.println("I am running");
    }
}

public class classesAndObjects {

    public static void main(String[] args) {
        Animal buzo = new Animal();
        Animal tommy = new Animal("black", 12);
        buzo.age = 10;
        buzo.Color = "brown";
        System.out.println("Buzon Info:"+buzo.age+"     "+buzo.Color);
        System.out.println("tommy Info:"+tommy.age+"     "+tommy.Color);
        buzo.eat();
        buzo.run();
    }
}
