import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial calculator\n");
        System.out.println("Enter Your Number: ");
        int num = input.nextInt();
        long factorial = doFactorial(num);
        System.out.println("Factorial of "+num+"is "+factorial);

    }

    public static long doFactorial(int num){
        int i = 1;
        int sum = 1;
        while(i<=num){
            sum *= i;
            i++;
        }
        return sum;
    }
}
