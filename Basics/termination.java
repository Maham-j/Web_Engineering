import java.util.*;
public class Termination{
	
	public int add(int v1,int v2){
		return v1+v2;
	}
	
	public static void main(String[] args){
		int count = 0;
		Scanner in = new Scanner(System.in);
		Termination cal = new Termination();
		
		
		while(true){
			
			System.out.println("Enter first value");
			int v1 = in.nextInt();
			
			System.out.println("Enter second value");
			int v2 = in.nextInt();
			
			if (v1 == -1 || v2 == -1){
				break;
				
			}
			System.out.println("The sum is " + cal.add(v1,v2));
			count +=1;
		System.out.println("The operations is performed " + count + " time(s)");
			
			
		}
		
}
}
		
