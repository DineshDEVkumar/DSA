package Functions_Methods;

import java.util.Scanner;

public class PythagoreanTriplet {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Triplet(a,b,c);
        sc.close();
    }
    public static void Triplet(int a,int b,int c){
        if (a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
        {
            System.out.println("YES");
        }
        
        else
            System.out.println("NO");
           }
    }
