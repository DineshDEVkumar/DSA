package Assignment1.Perimeter;

import java.util.Scanner;

public class Triangle {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the side1:");
         double side1 = scan.nextDouble();
         System.out.println("Enter the side2:");
         double side2 = scan.nextDouble();
         System.out.println("Enter the side3:");
         double side3 = scan.nextDouble();
         double Perimeter = side1+side2+side3;
         System.out.println("The perimeter of triangle is:"+Perimeter);
         scan.close();
     } 
}
