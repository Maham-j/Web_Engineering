import java.util.*;
public class MinMax{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for (int i =0 ; i <n ; i++){
			arr[i] = in.nextInt();
		}
		
		
		for (int i =0 ; i <arr.length ; i++){
			System.out.println(arr[i]);
		}

		int max = -999;
		int min = 9999;
		
		
		for (int i =0 ; i <arr.length ; i++){
			if (arr[i] > max){
				max = arr[i];
			}
		}
		
		for (int i =0 ; i <arr.length ; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		
		System.out.println("The max is " + max);
		System.out.println("The min is " + min);
	}
}
		
		
			
