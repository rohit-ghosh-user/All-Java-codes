import java.util.Scanner;

public class GCD {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Now Enter Your Second Number: ");
        int num2 = input.nextInt();
       int sum =  greatestCommonDivisior(num1,num2);
        System.out.println("Your GCD is: "+sum);

    }

    public static int greatestCommonDivisior(int num1,int num2){
        int least = least(num1,num2);
        int i = least;
        while (i<=least){
            int sum = num1%i;
            if(sum==0&&num2%i==0){
                return i;
            }
            i--;
        }
            return 0;
    }

    public static int least(int first , int second){
        if(first<second){
            return first;
        }
        else{
            return second;
        }
    }
}
