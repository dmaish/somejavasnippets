//programme printing 1 to 100.fizz for multiples of 3 and buzz
//for those of 5.FizzBuzz for those of both 3 and 5.
public class fizzBuzz {
	public static void main(String[]args){
	int limit=100;
	
	for(int i=1;i<=limit;i++){
		if(i%5==0 & i%3==0){
			System.out.println("FizzBuzz");
		}else if(i%3==0 ){
			System.out.println("Fizz");
		}else if(i%5==0){
			System.out.println("Buzz");
		}else{
			System.out.println(i);
		}
	}
}
}
	