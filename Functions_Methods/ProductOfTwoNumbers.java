package Functions_Methods;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Product(a,b);
        sc.close();
    }
    public static void Product(int a,int b){
        int mul=a*b;
        System.out.println(mul+" ");
    }
}
