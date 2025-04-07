import java.util.*;
public class Basic{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first value");
		int v1 = in.nextInt();
		
		System.out.println("Enter second value");
		int v2 = in.nextInt();
		
		if (args[0].equals("-")){
			System.out.println("The result is " + (v1-v2));
		}
			
		if (args[0].equals("+")){
			System.out.println("The result is " + (v1+v2));
		}
			
		if (args[0].equals("x")){
			System.out.println("The result is " + (v1*v2));
		}
			
		if (args[0].equals("/")){
			System.out.println("The result is " + (v1/v2));
			
		}
		}
}
		
