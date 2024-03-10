//write a java program to transpose of matirx

import java.util.Scanner;

public class transpose {
    public static void main(String[] args)
     {
     Scanner ab = new Scanner(System.in);
     int i,j;
     System.out.println("enter the no of rows: ");
     int rows= ab.nextInt();
     System.out.println("enter the no of column: ");
     int cols=ab.nextInt();
     int matrix[][]= new int[rows][cols];
     System.out.println("enter the matrix: ");
     for(i=0;i<rows;i++)
     {
        for(j=0;j<cols;j++)
        {
            matrix[i][j]=ab.nextInt();
        }
     }  
     int transpose[][]=new int[cols][rows];
     for(i=0;i<rows;i++)
     {
        for(j=0;j<cols;j++)
        {
            transpose[j][i]=matrix[i][j];
        }
     } 
     System.out.println("transpose matrix: ");
     for(i=0;i<cols;i++)
     {
        for(j=0;j<rows;j++){
            System.out.print(transpose[i][j]+ " ");
        }
        System.out.println( );
     }
    }

}
