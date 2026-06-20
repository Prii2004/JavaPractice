//Find largest digit in a number.

import java.util.*;
public class LargestDigit {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int largest = 0;
        do {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            num = num / 10;
        } while (num > 0);
        System.out.println("Largest digit = " + largest);
    }
}