package basicCodes;

import org.openqa.selenium.json.JsonOutput;

public class differentMethods {

    public static int addition(int a, int b){
        int c = a + b;
        return c;
    }
    public static void swapWithoutThird(int a, int b){
        System.out.println("old value:"+a);
        System.out.println("old value:"+b);
        a = a + b;
        b = a - b;
        a= a - b;
        System.out.println("new value:"+a);
        System.out.println("new value:"+b);
    }

    public static float floatMultiplication(float a, float b){
        float c = a*b;
        return c;
    }

    public static void evenOrOdd(int num){
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

    public static void vowelOrConsonent(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            System.out.println(c + " is vowel");
        else
            System.out.println(c + " is consonant");

    }

    public static void isLeap(int year){
        if((year % 400 == 0)||(year%4 == 0) && (year%100!= 0)){
            System.out.println("is leap");
        }
        System.out.println("not a leap");
}

    public static void main(String[] args) {

    }
}
