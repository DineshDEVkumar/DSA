package Assignment1.Area;

import java.util.Scanner;

public class AreaofRectangle {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the length:");
         double length = scan.nextDouble();
         System.out.println("Enter the breadth:");
         double breadth = scan.nextDouble();
         double area = length*breadth;
         System.out.println("The area of rectangle5 is:"+area);
         scan.close();
     } 
}
