package Assignment1;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double r=scanner.nextDouble();
        double h=scanner.nextDouble();
        double CurvedSurfaceArea = (2*Math.PI*r*h);
        System.out.printf("The volume of the prism is: "+CurvedSurfaceArea);
        scanner.close();
    }
}
