package Assignment1;

import java.util.Scanner;

public class SurfaceAreaOfCube {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the area of the cube: ");
        double a=scanner.nextDouble();
        double SurfaceArea = (6*a*a);
        System.out.printf("The volume of the prism is: "+SurfaceArea);
        scanner.close();
    }
}
