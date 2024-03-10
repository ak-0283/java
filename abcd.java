//write a java program to input the array element perform the addition,subtraction,
//multiplication,divison and display the result

import java.util.Scanner;

class abcd 
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int a[];
        a=new int[5];
        int b[];
        b=new int[5];
        int c[];
        c=new int[5]; 
        int d[];
        d=new int[5];
        int e[];
        e=new int[5];
        int f[];
        f=new int[5];
        int i;
        System.out.println("enter the first array: ");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the second array: ");
        for(i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            c[i]=a[i]+b[i];
            d[i]=a[i]-b[i];
            e[i]=a[i]*b[i];
            f[i]=a[i]/b[i];
        }
        System.out.println("sum: ");
        for(i=0;i<5;i++)
        {
            System.out.println(" "+ c[i]);
        }

        System.out.println("sub: ");
        for(i=0;i<5;i++)
        {
            System.out.println(" "+ d[i]);
        }

         System.out.println("Mul: ");
        for(i=0;i<5;i++)
        {
            System.out.println(" "+ e[i]);
        }

         System.out.println("div: ");
        for(i=0;i<5;i++)
        {
            System.out.println(" "+ f[i]);
        }
    }
}