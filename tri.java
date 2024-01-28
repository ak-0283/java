import java.util.Scanner;

public class tri {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        float l,b,s,c,h,x,y,z;
        
        System.out.println("enter the length: ");
        l = ab.nextInt();
        System.out.println("enter the breadth: ");
        b = ab.nextInt();
        x = l * b; 
        System.out.println("Area of rectangle: "+x);

        System.out.println("enter the side: ");
        s = ab.nextInt();
        y = s * s;
        System.out.println("Area of square: "+y);

        System.out.println("enter the base: ");
        c = ab.nextInt();
        System.out.println("enter the height: ");
        h = ab.nextInt();
        z = (c*h)/2;
        System.out.println("Area of triangle: "+z);
    }
}
