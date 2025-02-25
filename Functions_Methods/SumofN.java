package Functions_Methods;

import java.util.Scanner;

public class SumofN {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid number");
        }
        else {System.out.println(Sum(n));}
        sc.close();
    }
    public static int Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
