package Assignment1.Volume;
import java.util.*;
public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double r=scanner.nextDouble();
        double h=scanner.nextDouble();
        double CylinderVolume = (Math.PI*r*r*h);
        System.out.printf("The volume of the cylinder is: "+CylinderVolume);
        scanner.close();
    }
}
