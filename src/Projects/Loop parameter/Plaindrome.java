import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number Which You Want to Check: ");
        int num = input.nextInt();

        if(isPlaindrome(num)){
            System.out.println(num+" is a plaindrome number");
        }
        else {
            System.out.println(num+" is not a plaindrome number");
        }

    }
    public static boolean isPlaindrome(int num){
        return num == checkNumber(num);

    }
    public static int checkNumber(int num){
        int sum =0;
        while(num>0){
            int digit = num%10;
            sum = sum*10+digit;
            num = num/10;

        }
        return sum;

    }
}
