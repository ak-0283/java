//write a java program to merge matrix and the first array have 6 elements 
//and the second array have 10 elements
import java.util.Scanner;

public class merge 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[];
        a=new int[6];
        int b[];
        b=new int[10];
        int c[];
        c=new int[16];
        int i,j=0;
        System.out.println("enter the first six elements: ");
        for(i=0;i<6;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the second ten elements: ");
        for(i=0;i<10;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<6;i++)
        {
            c[j]=a[i];
            j++;
        }
        for(i=0;i<10;i++)
        {
            c[j]=b[i];
            j++;
        }
        System.out.println("merged array: ");
        for(i=0;i<16;i++)
        {
            System.out.println(" "+c[i]);
        }
    }
}
