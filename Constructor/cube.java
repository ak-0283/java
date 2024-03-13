import java.util.Scanner;

class area
{
    area(int r)
    {
        double res=r*r*r;
        System.out.println("side of cube: "+r);
        System.out.println("volume of cube: "+res);
    }
}
class cube 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side of cube: ");
        int side =sc.nextInt();
        area a = new area(side);
    }
}
