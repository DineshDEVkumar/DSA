package Assignment1.Area;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = scan.nextDouble();
        double area = Math.PI*r*r;
        System.out.printf("The area of the circle is: "+area);
        scan.close();
    }
}
