package week1.day2;
import java.util.*;
public class FibonacciSeries {
	  public static void main(String[] args) {
	        // Scanner in = new Scanner(System.in);

	        int n = 8;

	        int a = 0;
	        int b = 1;
	        System.out.print(a+" ");
	        System.out.print(b+" ");

	        for(int i=2;i<n;i++){
	            int c = a + b;
	            a = b;
	            b = c;
	            System.out.print(c+" ");
	        }
	    }    
	}



