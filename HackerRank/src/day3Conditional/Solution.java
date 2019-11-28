package day3Conditional;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2==0){
            if((n>2 && n<5)|| (n>20))
            System.out.println("Not Weird");
            if(n>5 && n<21)
               System.out.println("Weird"); 
        }else{
         System.out.println("Weird");   
        }
        scanner.close();
    }
}
