//this method stores the letters of a string into an array,each character in its own Index
public class someClass {
 
	public static void main(String[]args){
		//create the String class object
		String stringObject=new String("I am in an Array.");
			char[]someArray=stringObject.toCharArray();
			
			for(int i=0;i<=someArray.length;i++){
				
		        System.out.println(someArray[i]);
				
			}
		
	} 
}
