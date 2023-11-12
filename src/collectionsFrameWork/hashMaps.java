package collectionsFrameWork;

import java.util.HashMap;
import java.util.Map;

public class hashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //Inserting data:
        map.put("Prabhat",101);
        map.put("Rahul",102);
        map.put("Tukku",103);
        map.put("Nidhi",104);
        map.put("Tani",106);
        map.put("Chitra",107);
        map.put("Khwahish",108);
        //printing te size of map:
        System.out.println("Size of the map is:"+map.size());
        //Printing the Value with Chitra:
        System.out.println("Value associated with CHitra:"+map.get("Chitra"));
        //Increase the value and print a new one
        int a = map.get("Chitra") +2;
        map.put("Chitra",a);
        System.out.println(" New Value associated with CHitra:"+map.get("Chitra"));
        map.replace("Chitra", 112);
        // Simple priniting a map
        System.out.println(map);
        //Traversing a map with for each loop with for each loop :
        for (Map.Entry<String, Integer>e: map.entrySet())
            System.out.print(e.getKey()+""+e.getValue());


    }
}
