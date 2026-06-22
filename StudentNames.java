//Write a Java program to input the names of 5 students into a String array and then display all the names entered by the user.

import java.util.*;
public class StudentNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter the names of 5 students:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("Student Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}