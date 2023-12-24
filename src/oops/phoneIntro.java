package oops;

class iphone implements mobile{

@Override
public void intro() {
        System.out.println("I am iphone with 25g GB RAM");
        }
}

class samsung implements mobile{

    @Override
    public void intro() {
        System.out.println("I am samsung mobile with 512 GB RAM");
    }
}

public class phoneIntro {
    public static void main(String[] args) {

    }
}
