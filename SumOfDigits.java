//Write a Java method to compute the sum of the digits in an integer.

import java.util.*;
public class SumOfDigit {
    public static void main(String[]args){
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }  
}
