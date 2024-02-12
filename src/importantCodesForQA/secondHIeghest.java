package importantCodesForQA;

public class secondHIeghest {
	public static int printsecondHighestNumber(int a, int b, int c) {
		int secondHighest;
		 if ((a >= b && a <= c) || (a >= c && a <= b)) {
	            secondHighest = a;
	        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
	            secondHighest = b;
	        } else {
	            secondHighest = c;
	        }
	        
	        return secondHighest;
	}

	public static void main(String[] args) {
		System.out.println("Second highest Number is:"+printsecondHighestNumber(45, 48, 59));

	}

}
