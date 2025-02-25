package Functions_Methods;
import java.util.*;
public class VotingAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        AgeForVoting(age);
        sc.close();
    }
    public static void AgeForVoting(int age){
        if(age>=18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not Eligible for voting");
        }
    }
}
