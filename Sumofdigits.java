public class Sumofdigits {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int lastdigit;
        while (num>0){
            lastdigit = num%10;
            sum +=lastdigit;
            num/=10;
        }
        System.out.println("The sum of digits is "+sum);
    }
}
