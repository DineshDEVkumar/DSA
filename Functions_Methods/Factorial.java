package Functions_Methods;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f=sc.nextInt();
        if(f==0 || f==1){
            System.out.println("Factorial of "+f+" is 1");
        }
        else{
            Fact(f);
        }
        sc.close();
    }
    public static void Fact(int f){
        int fact=1;
        for(int i=1;i<=f;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+f+" is: "+fact);    
    }
}
