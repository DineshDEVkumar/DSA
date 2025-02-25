package Functions_Methods;

import java.util.Scanner;

public class PrimeOrNot {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Prime(a);
        sc.close();
    }

    public static void Prime(int a){
       int b=a/2;
       int flag=0;
       if(a==0 || a==1 || a<0){
        System.out.println("Neither prime nor Composite number");
       }       
       else {
        for(int i=2;i<=b;i++){
            if(a%i==0){
                System.out.println(a+" is not prime number");      
                flag=1;      
                break;    
            }
            
        }
        if(flag==0){
            System.out.println(a+" is a prime number");
        }
    }
    }
}
