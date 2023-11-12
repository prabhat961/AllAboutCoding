package collectionsFrameWork;

import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        //Set Creation:
        HashSet<String> hs = new HashSet<>();
        //Adding Element to set:
        hs.add("Prabhat");
        hs.add("Rahul");
        hs.add("Nishal");
        hs.add("Bobby");
        hs.add("Shanu");
        hs.add("Tukku");
        hs.add("Isha");
        //size of set:
        System.out.println("Size of this set is:"+hs.size());
        //Simple printing this set:
        System.out.println(hs);
        //for loop printing of Set:
        for (String name: hs){
            System.out.print(name +",");
        }
        System.out.println();
        ///Removing an element from set:
        hs.remove("Rahul");
        //Printing set after removal:
        System.out.println(hs);
        //Check whether contains or not
        System.out.println("Element is present:"+hs.contains("Rahul"));
        System.out.println("Element is present:"+hs.contains("Bobby"));

    }
}
