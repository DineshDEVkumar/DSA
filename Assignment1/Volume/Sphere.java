package Assignment1.Volume;

import java.util.Scanner;

public class Sphere {
     public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double r=scanner.nextDouble();
        double SphereVolume = ((4/3)*Math.PI*r*r);
        System.out.printf("The volume of the prism is: "+SphereVolume);
        scanner.close();
    }
}
