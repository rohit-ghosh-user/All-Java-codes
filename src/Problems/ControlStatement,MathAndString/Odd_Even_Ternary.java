import java.util.Scanner;

public class Odd_Even_Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even checker \n");
        System.out.println("Enter your number which you want to check: ");
        int num = input.nextInt();
        Odd_Even_Ternary evenOdd = new Odd_Even_Ternary();
        String oddEven = evenOdd.returnOddEven(num);
        System.out.println("Your num is "+oddEven);
    }

    public String returnOddEven(int num){
        String oddEven;
        return oddEven = num % 2 == 0 ? "Even":"Odd";
    }

}
