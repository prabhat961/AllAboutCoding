package GFGCodes.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIntro {

	public static void main(String[] args) {
		HashMap<String,Integer>hm = new HashMap<>();
		hm.put("Prabhat", 105);
		hm.put("Rahul", 106);
		hm.put("Chitra", 107);
		hm.put("Nidhi", 108);
		hm.put("Adi", 109);
		hm.put("Suraj", 110);
		
		// extract keys to a set
		Set<String> keys = hm.keySet();
		
		
		//extracting values for each key
		for (String k: keys) {
			System.out.println(k);
		}
		
		for(Map.Entry<String, Integer>mp:hm.entrySet())
			System.out.println(mp.getKey()+" "+mp.getValue());
		
	}

}

