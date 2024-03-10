//write a java program to add two matrix

import java.util.Scanner;

public class add_matrices {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        int i,j;
        System.out.println("enter first matrix: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second matrix: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("resultant matrix: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(c[i][j]+ " ");
            }
        }
    }
}
