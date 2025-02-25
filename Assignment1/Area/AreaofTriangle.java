package Assignment1.Area;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the base:");
    double base = scan.nextDouble();
    System.out.println("Enter the height:");
    double height = scan.nextDouble();
    double area = (height*base)/2;
    System.out.println("The area of triangle is:"+area);
    scan.close();
    }
}
