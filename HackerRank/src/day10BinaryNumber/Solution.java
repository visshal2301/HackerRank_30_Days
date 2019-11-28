package day10BinaryNumber;

import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int sum=0,max=0;
        while(n>=1) {
        int remainder =n%2;
        //objStack.push(remainder);
        if(remainder==1) {
            sum++;
            if(sum>max) {
                max=sum;
            }
        }else {
            sum=0;
        }
        n=n/2;
        }
        System.out.println(max);

        scanner.close();
    }
}
