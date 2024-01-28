//write a java program to calculate the addition,subtraction,multiplication,divison of two no.
import java.util.Scanner;

public class sum {
    public static void main(String args[]) {
        Scanner ab = new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("Enter the first number: ");
        a = ab.nextInt();
        System.out.println("Enter the second number: ");
        b = ab.nextInt();
        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b;
        System.out.println("Add: "+c);
        System.out.println("Subtract: "+d);
        System.out.println("Multiply: "+e);
        System.out.println("Divide: "+f);
    }
}
