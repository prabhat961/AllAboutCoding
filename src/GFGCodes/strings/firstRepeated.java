package GFGCodes.strings;

import java.util.HashSet;
import java.util.Set;






//Print the first repeated character in the string.
public class firstRepeated {
	public static char printFirstRepeatedCharacterNaive(String str) {
		 int n = str.length();
		    char ans = ' ';
		    int index = Integer.MAX_VALUE;
		    for (int i = 0; i < n; i++) {
		      char temp = str.charAt(i);
		      for (int j = i + 1; j < n; j++) {
		        if (str.charAt(j) == temp){
		          if (j < index) {
		            index = j;
		            ans = str.charAt(j);
		          }
		        }
		      }
		    }
		    return ans;
		  }
		   
		  public static void printFirstRepeatedCharacterOpt(String str) {
		Set<Character>st = new HashSet<>();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (st.contains(arr[i])) {
				System.out.println("First Repeating Character is:"+arr[i]);
				break;
			}
			else {
				st.add(arr[i]);
				}
			
		}
	}

	public static void main(String[] args) {
		 {
			 String str = "geeksforgeeks";
			 System.out.println(printFirstRepeatedCharacterNaive(str));
		}

	}

}
