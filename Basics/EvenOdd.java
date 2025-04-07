import java.util.*;
public class EvenOdd{
	public static void main(String[] args){
		int[] arr = {5,7,2,4,9};
		int even = 0,odd = 0;
		
		for (int i=0 ; i <arr.length;i++){
			if (i%2==0){
			   even +=1;
			}else{
				odd+=1;
			}
		}
			
		
		System.out.println("Count of even numbers " + even);	
		System.out.println("Count of odd numbers " + odd);
		
}
}
		
