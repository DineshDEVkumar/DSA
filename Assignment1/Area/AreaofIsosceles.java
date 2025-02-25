package Assignment1.Area;

import java.util.Scanner;

public class AreaofIsosceles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the equal sides of the isosceles triangle:");
        double sideLength = scan.nextDouble();
        System.out.println("Enter the length of the base of the isosceles triangle:");
        double baseLength = scan.nextDouble();
        double height = Math.sqrt(Math.pow(sideLength, 2) - Math.pow(baseLength / 2, 2));
        double area = (baseLength * height) / 2;
        System.out.println("The area of the isosceles triangle is: " + area);
        scan.close();
    }
}
