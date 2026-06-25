import java.util.*;
public class Area_Function {
    static double circle(double r) {
        return 3.14 * r * r;
    }
    static int rectangle(int l, int b) {
        return l * b;
    }
    static int square(int s) {
        return s * s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter side of square: ");
        int s = sc.nextInt();
        System.out.println("Area of Circle = " + circle(r));
        System.out.println("Area of Rectangle = " + rectangle(l, b));
        System.out.println("Area of Square = " + square(s));
    }
}