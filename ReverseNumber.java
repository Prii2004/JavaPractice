//Write a program to reverse a number.

import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        while (n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }
    }
}