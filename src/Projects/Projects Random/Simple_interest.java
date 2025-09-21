import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Principle Amount (P): ");
        float P = input.nextFloat();
        System.out.print("Enter Your Rate of Interest (R): ");
        float R = input.nextFloat();
        System.out.print("Enter Your Time Period (T): ");
        float T = input.nextFloat();

        double SI = (P*R*T)/100;

        System.out.println("Your Simple Interest is: "+SI);
    }
}
