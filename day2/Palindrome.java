package week1.day2;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int n = 121;
        int temp = n;
        int rev = 0;
        
        for(int i=n;i>0;){
            int rem = i % 10;
            rev = rem + rev*10;
            i = i/10;
        }

        if(rev == n){
            System.out.println(n+" is palindrome");
        }
        else{
            System.out.println(n+" is not palindrome");
        }
    }    
}
