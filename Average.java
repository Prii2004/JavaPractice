public class Average {
    public static void main(String [] args){
        int a, b, c, sum, avg;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the 1st number");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        b = sc.nextInt();
        System.out.println("Enter the 3rd number");
        c = sc.nextInt();
        sum = a + b + c;
        avg = sum / 3;
        System.out.println("The average of three numbers = " + avg);
    }
}
