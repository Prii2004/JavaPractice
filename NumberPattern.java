/*Write a Java program using nested do-while loops to display the following pattern:
1
12
123
1234
12345 */

public class NumberPattern {
    public static void main(String[]args) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(j);
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 5);
    }
}