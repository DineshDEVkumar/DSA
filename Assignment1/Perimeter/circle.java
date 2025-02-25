package Assignment1.Perimeter;

import java.util.Scanner;

public class circle {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = scan.nextDouble();
        double perimeter= (2*Math.PI*r);
        System.out.printf("The perimeter of the circle is: "+perimeter);
        scan.close();
    }
}
