//Write a Java method to compute the averageof three numbers.

import java.util.*;
public class Average_Function {
    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();
        System.out.println("Average = " + average(num1, num2, num3));
    }
}


