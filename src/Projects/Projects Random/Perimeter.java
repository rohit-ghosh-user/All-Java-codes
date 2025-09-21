import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Length of Rectangle in cm: ");
        float length = input.nextFloat();
        System.out.print("Enter Your Width of Rectangle in cm: ");
        float width = input.nextFloat();

        float sum = 2*(length+width);

        System.out.println("Yor Perimeter is: "+sum+"cm");

    }
}
