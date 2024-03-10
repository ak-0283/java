//write a java program to input 5 elements of an array. calculate the average,maxmimm
//and minimum of the array and display the result

import java.util.Scanner;

class maximum 
{
  public static void main(String[] args) 
  {
    Scanner ab=new Scanner(System.in);
    int a[];
    a=new int[5];
    int min,max,sum=0,i;
    double avg;
    System.out.println("enter the element: ");
    for(i=0;i<5;i++)
    {
        a[i]=ab.nextInt();
    }
    min=a[0];max=a[0];
    for(i=0;i<5;i++)
    {
        if (a[i]<min) 
        {
            min=a[i];
        }
       if(a[i]>max)
       {
        max=a[i];
       }
    }
     for(i=0;i<5;i++)
    {
        sum=a[i]+sum;
    }
    avg=sum/5.0;
    System.out.println("min: " + min);
    System.out.println("max: " + max);
    System.out.println("avg: " + avg);
}
}
