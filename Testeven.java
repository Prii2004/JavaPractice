/*Write a method named isEven that accepts an intargument. 
The method should return true if the argument is even, or false otherwise.*/

import java.util.*;
public class Testeven {
    static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
            System.out.println(isEven(num));   
    }
}