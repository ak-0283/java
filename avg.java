//write a java program to input 5 elements of an array calculate the average,minimum & maximum of the array and display the result

import java.util.Scanner;

class avg 
{
    public static void main(String args[]) 
    {
        int a[]=new int[100];
        double avv;
        int sum=0,min,max,avrg=1;
        Scanner ab = new Scanner(System.in);
        System.out.println("enter 5 numbers: ");
        for(int i=1;i<=5;i++)
        {
            a[i]=ab.nextInt();
        }
        max=min=a[1];
        for(int i=0;i<5;i++)
        {
            sum = sum + a[i];
            avrg = sum / 5;
        }
        for(int i=1;i<=5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            else if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Average: " + avrg);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
