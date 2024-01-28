import java.util.*;

class sqr {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter an integer number: ");
        num = sc.nextInt();

        System.out.println("Square of " + num + " is: " + Math.pow(num, 2));
        System.out.println("Cube of " + num + " is: " + Math.pow(num, 3));
        System.out.println("Square Root of " + num + " is: " + Math.sqrt(num));
    }
}
