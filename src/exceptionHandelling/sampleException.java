package exceptionHandelling;

import java.io.FileInputStream;

public class sampleException {
    public static void main(String[] args) {
        int a = 100, b= 0, c;

        try {
            FileInputStream file = new FileInputStream("d:/abc.txt");// exception occur  in this line but we have handlled by using trey catch block
            Class.forName("com.mysql.jdbc.driver");
            c= a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
