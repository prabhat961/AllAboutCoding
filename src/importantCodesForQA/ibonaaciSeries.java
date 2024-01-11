package importantCodesForQA;



public class ibonaaciSeries {
	
	 public static void Fibonacci(int N){     
			 int num1=0,num2=1,num3,i;    
			 System.out.print(num1+" "+num2);//printing 0 and 1    
			    
			 for(i=2;i<N;++i)//loop starts from 2 because 0 and 1 are already printed    
			 {    
			  num3=num1+num2;    
			  System.out.print(" "+num3);    
			  num1=num2;    
			  num2=num3;    
			 }  
	   }
	  
	    // Driver Code 
	    public static void main(String args[]) 
	    { 
	        // Given Number N 
	        int N = 10; 
	  
	        // Function Call 
	        Fibonacci(N); 
	    }

}
