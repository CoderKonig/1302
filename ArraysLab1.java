import java.util.*;
public class ArraysLab1 {
   
	
		public static boolean isSorted(int arr[]){
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]<arr[i-1]){
	                return false;
	            }
	        }
	        return true;
	    }
		
	    public static void main(String[] args) {
	    	
	    	
	        Scanner obj = new Scanner(System.in);
	        
	        System.out.println("Enter the number of elements");
	        int n = obj.nextInt();
	        
	        System.out.println("Enter n elements");
	        int arr[] =  new int[n];
	        
	        for(int i=0;i<n;i++){
	            arr[i] = obj.nextInt();
	        }
	        System.out.println(isSorted(arr));
	    }
	}

