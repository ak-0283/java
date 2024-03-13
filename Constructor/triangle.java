import java.util.Scanner;

class area
{
 area(int b,int h)
 {
    System.out.println("height of traingle: "+h);
    System.out.println("base of trinagle: "+b);
    double res=0.5*b*h;
    System.out.println("area of traingle: "+res);
 }
}

 class triangle 
 {
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter base of triangle: ");
    int a=sc.nextInt();
    System.out.println("enter height of triangle: ");
    int l = sc.nextInt();
    area c = new area(a, l);
   }  
}
