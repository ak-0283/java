import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the temperature: ");
        a = ab.nextInt();
        b = (a*9/5)+32;
        c = (a-32)*5/9;
        System.out.println("Celcius: "+c);
        System.out.println("Farenhit: "+b);
    }
}
