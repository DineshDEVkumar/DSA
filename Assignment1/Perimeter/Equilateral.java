package Assignment1.Perimeter;

import java.util.Scanner;

public class Equilateral {
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side value:");
        double sideLength = scan.nextDouble();
        double perimeter = (3*sideLength);
        System.out.printf("The perimeter of the SideLength is: "+perimeter);
        scan.close();
    }
}
