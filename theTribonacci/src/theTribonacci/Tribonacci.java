package theTribonacci;

public class Tribonacci {
	public static void main(String[]args){
		int limit=20;
		int a=0,b=1,c=2;
        int d=a+b+c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		for(int i=0;i<=limit;i++){
			System.out.println(d);
			
			//switching the initial digits
			a=b;
			b=c;
			c=d;
			d=a+b+c;
		}
		
	}

}
