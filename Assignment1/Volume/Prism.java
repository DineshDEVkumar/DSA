package Assignment1.Volume;

import java.util.Scanner;

public class Prism {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the breadth of the prism: ");
        double b=scanner.nextDouble();
        double h=scanner.nextDouble();
        double PrismVolume = (b*h);
        System.out.printf("The volume of the prism is: "+PrismVolume);
        scanner.close();
    }
}
