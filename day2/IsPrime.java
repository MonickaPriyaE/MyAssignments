package week1.day2;

import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if (n < 2) {
            System.out.println(n + " is not a prime number");
            return;
        }

        boolean ans = true;
        for(int i=2;i<n;i++){
            if(n % i == 0){
                ans = false;
                break;
            }
        }

        if(ans){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
    }
}
