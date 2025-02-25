import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =0;
        int input = in.nextInt();
        int n = in.nextInt();
        while(input > 0){
            int rem = input%10;
            if(rem == n){
                count++;
            }
            input = input/10;
        }
        System.out.println(count);
        in.close();
    }
}
