package Assignment1.Perimeter;

import java.util.Scanner;

public class Square {
     public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the sidelength:");
    double sidelength = scan.nextDouble();
    double Perimeter = 4*sidelength;
    System.out.println("The perimeter of square is:"+Perimeter);
    scan.close();
    }
}
