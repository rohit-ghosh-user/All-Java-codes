import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Digits Calculator\n");
        System.out.println("Enter Your Digits: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println(sum);

    }

//    public static int sumOfDigits(int number){
//        int sum = number%10;
//        System.out.println(sum);
//        int devide = number/10;
//        System.out.println(devide);
//        int sum1 = devide%10;
//        System.out.println(sum1);
//        int devide1 = devide/10;
//        System.out.println(devide1);
//        int allSum = sum+sum1+devide1;
//        return allSum;
//    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

}
