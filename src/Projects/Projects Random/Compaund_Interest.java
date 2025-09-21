import java.util.Scanner;

public class Compaund_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Principle Amount (P): ");
        float P = input.nextFloat();
        System.out.print("Enter Your Rate of Interest (R): ");
        float R = input.nextFloat();
        System.out.print("Enter Your Time Period (T): ");
        float T = input.nextFloat();

        double A = P*Math.pow((1+R/100),T);

        System.out.println("Your Compound Interest is: "+A);
    }
}
