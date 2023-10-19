package DSA.hashing;

import java.util.HashMap;
import java.util.Map;

public class hashMapIntro {

    public static void main(String[] args) {
        //Creating a HashMap

        HashMap<String, Integer> map = new HashMap<>();

        //Insert element into map

        map.put("Rohit", 21);
        map.put("Shivam", 32);
        map.put("Siddharth", 34);
        map.put("Nakul", 27);
        map.put("Prabhat", 19);
        map.put("Sam", 29);

        //Printing the size of map

        System.out.println("Size of the map is:"+map.size());

        //print the map

        System.out.println(map);

        // Modify the map

        //map.put(4, "Rahul");

        //System.out.println(map);


        //Printing the value associated to some key
         map.get("Prabhat");
        System.out.println(map.get("Prabhat"));

        //Increase the value of a key

        System.out.println(map.get("Prabhat")+1);


        //iterating to the map

        for (Map.Entry< String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());


    }
}
