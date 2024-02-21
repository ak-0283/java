//write a java program to input the array element perform the addition,subtraction,multiplication,divison and display the result
import java.util.Scanner;

class array 
{
    public static void main(String[] args) 
    {
        int a[]=new int[100],i,sum = 0,sub=0,n;
        double mul=1,div=1;
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the size: ");
        n=ab.nextInt();
        System.out.println("enter array elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=ab.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
            sub=sub-a[i];
            mul=mul*a[i];
            div=div/a[i];
        }
        System.out.println("sum is: " + sum);
        System.out.println("subtraction is: " + sub);
        System.out.println("multiplication is: " + mul);
        System.out.println("divison is: " + div);
    }
}
