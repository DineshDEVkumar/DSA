package Functions_Methods;
import java.util.*;
public class Circle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        Circumference(r);
        Area(r);
        sc.close();
    }
    public static void Circumference(int r){
        double circumference=(2*Math.PI*r);
        System.out.println(circumference+" ");
    }
    public static void Area(int r){
        double area=Math.PI*r*r;
        System.out.println(area+" ");
    }
}
