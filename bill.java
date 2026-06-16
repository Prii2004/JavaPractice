/*Enter cost of 3 items from the user (using float datatype) - a pencil, a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill.*/


import java.util.*;
public class Bill{
    public static void main(String [] args){
        float pen, pencil, eraser, total, bill;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the price of pen:");
        pen = sc.nextFloat();
        System.out.println("Enter the price of pencil:");
        pencil = sc.nextFloat();
        System.out.println("Enter the price of eraser:");
        eraser = sc.nextFloat();
        total = pen + pencil + eraser;
        bill = total + (total * 0.18f);
        System.out.println("Total bill is " + bill);
    }
}
