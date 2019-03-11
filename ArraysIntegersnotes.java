import java.util.*;
public class ArraysIntegersnotes {

	public static double avg(int[] arr) {
	
		double sum = 0;
		for (int i = 0; i< arr.length; i++) {
			sum += arr[i];
		};
		
		double avg = sum/arr.length;
		return avg ;
	}
	
	public static void main ( String [] args) {
		int [] ted= {3,15,30,21};
		double teds_avg = avg(ted);
		System.out.println(teds_avg);
		
		
		
		
	}	
}