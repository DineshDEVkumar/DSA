package Assignment1.Volume;

import java.util.Scanner;

public class Pyramid {
     public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the breadth of the pyramid: ");
        double b=scanner.nextDouble();
        double h=scanner.nextDouble();
        double PyramidVolume = ((1/3)*b*h);
        System.out.printf("The volume of the prism is: "+PyramidVolume);
        scanner.close();
    }
}


