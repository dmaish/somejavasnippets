import java.util.Scanner;
public class Class1 {
	public static void main(String[]args){
		
		//some variables
		int someInt;
		String someString; 
		
	 //create a scanner object
		Scanner myScanner =new Scanner(System.in);
		Scanner anotherScanner =new Scanner(System.in);
		
		 System.out.println("Enter an Integer now;;;");
		  someInt=myScanner.nextInt();
		  
		 System.out.println("Enter some String now;;;");
     	 someString=anotherScanner.nextLine();
 
  System.out.println("your Integer is"+" "+ someInt );     	 
  System.out.println("your String is"+" "+ someString );

}
}