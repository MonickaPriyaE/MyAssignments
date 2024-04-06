package week1.day2;

	import java.util.*;

	public class FindMissingElement{
	    public static void main(String[] args){
	        // Scanner in = new Scanner(System.in);
	        int arr[] = {1,4,3,2,8,6,7};
	        Arrays.sort(arr);
	        int ans = 0;
	        for(int i=0;i<arr.length;i++){
	            if(i+1 != arr[i]){
	                ans = i+1;
	                break;
	            }
	        }
	        if(ans == 0){
	            System.out.println("No missing element in the array");
	        }
	        else{
	            System.out.println(ans);
	        }
	    }
	}
