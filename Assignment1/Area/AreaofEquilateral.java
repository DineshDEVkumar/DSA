package Assignment1.Area;

import java.util.Scanner;

public class AreaofEquilateral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side value:");
        double side = scan.nextDouble();
        double area = (Math.sqrt(3)/4)*(Math.pow(side,2));
        System.out.printf("The area of the equilateral is: "+area);
        scan.close();
    }
}
