package Assignment1.Perimeter;

import java.util.Scanner;

public class Parallelogram {
     public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the side1:");
    double side1 = scan.nextDouble();
    System.out.println("Enter the side2:");
    double side2 = scan.nextDouble();
    double perimeter = 2*(side1+side2);
    System.out.println("The perimeter of parallelogram is:"+perimeter);
    scan.close();
    }
}
