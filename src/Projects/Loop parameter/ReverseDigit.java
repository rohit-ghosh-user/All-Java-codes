import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse Digit Center");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
       int reverse =  reverseDigit(num);
        System.out.println(reverse);
    }
    public static int reverseDigit(int num){
        int ans = 0;
        while(num>0){
            int digit = num%10;
             ans = ans*10+digit;
            num = num/10;

        }
        return ans;
    }
}
