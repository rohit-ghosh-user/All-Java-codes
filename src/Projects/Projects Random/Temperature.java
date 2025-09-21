import java.util.Scanner;

public class Temperature {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter Your Temperature in Fahrenhite: ");
            float F = input.nextFloat();

            float C = (F - 32) * 5 / 9;

            System.out.println("Your Converted Temperature is: " + C + " C");
        }
    }
