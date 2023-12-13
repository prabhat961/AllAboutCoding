package basicCodes;

import java.util.HashMap;
import java.util.Map;

import GFGCodes.Matrx.intro;


public class sapientCode {
	public static void printfrequency(int[] arr) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (mp.containsKey(arr[i])) {
				int c = mp.get(arr[i]);
				mp.put(arr[i], c + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
			System.out.println(m.getKey() + " " + "Occurs" + m.getValue() + " " + "times");
		}
	}
}
	
	
