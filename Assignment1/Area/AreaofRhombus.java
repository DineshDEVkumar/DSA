package Assignment1.Area;

import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the diagonal1:");
    double diagonal1 = scan.nextDouble();
    System.out.println("Enter the diagonal2:");
    double diagonal2 = scan.nextDouble();
    double area = (diagonal1*diagonal2)/2;
    System.out.println("The area of rhombus is:"+area);
    scan.close();
    }
}
