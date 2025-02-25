package Functions_Methods;

import java.util.Scanner;

public class PrimeBetweenNum {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==0 || a==1 || b==0|| b==1){
            System.out.println("neither prime nor composite");
        } 
        else {
    
    for (int i = a; i <= b; i++)
    if (isPrime (i))
     System.out.println (i);
}
sc.close();
     }

static boolean isPrime (int n)
{

  // 0, 1 negative numbers are not prime
  if (n < 2)
    return false;

  // checking the number of divisors b/w 1 and the number n-1
  for (int i = 2; i < n; i++)
    {
  if (n % i == 0)
     return false;
    }

  // if reached here then must be true
  return true;
}
}
