//write a java program to find the area of a rectangle using constructor

import java.util.*;
class rec
    {
        rec(int l,int b)
        {
            System.out.println("length of rectangle: "+l);
            System.out.println("breadth of rectangle: "+b);
            double res=l*b;
            System.out.println("area of rectangle: "+res);
        }
    }
    class area 
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter length of rectangle: ");
            int a=sc.nextInt();
            System.out.println("enter breadth of rectangle: ");
            int c= sc.nextInt();
            rec s = new rec(a,c);
        }
        
    }
