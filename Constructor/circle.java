import java.util.Scanner;

class area
{
 area(double l)
 {
    System.out.println("radius of circle: "+l);
    double res=3.14*l*l;
    System.out.println("area of rectangle: "+res);
 }
}
 class circle 
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle: ");
        double a = sc.nextInt();
        area f = new area(a);
    }
}
