//By considering the terms in the fibonacci sequence whose
//value do not exceed four million, find the sum of the even-valued terms

public class classFibonacciSum {
 public static void main(String[]args){
	 int num1=1;
	 int num2=0;
	 int limit=10;
	 
	 for(int i=num1;i<=limit;i++){
		 int num3=num1+num2;
		 
		 if(num2<=0){
			 num2=2;
		 }
		 
		
		 
		System.out.println(num3);
		 
		 if(num1<=1&num2<=2){
			 System.out.println(num1);
			 System.out.println(num2);
		 }
		 
		 num1=num2;
		 num2=num3;
		 
		
	 }
 }
}
