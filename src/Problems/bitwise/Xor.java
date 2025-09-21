import java.util.Scanner;

public class Xor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your First Number: ");
        int num = input.nextInt();

        System.out.print("Please Enter Your Second Number: ");
        int num2 = input.nextInt();

        int xor = num^num2;

        System.out.println("Your Output is: "+xor);

    }
}
