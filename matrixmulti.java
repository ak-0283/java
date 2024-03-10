//write a java program to multiply of two matrix
import java.util.Scanner;

 class matrixmulti {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        int j,k,l,i;
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
                c[i][j]=0;
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                for(k=0;k<2;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.print("resultant matrix: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println(c[i][j]+ " ");
            }
        }
    }
}