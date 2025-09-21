import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Ground Length That is B in cm: ");
        float B = input.nextFloat();
        System.out.print("Enter The Height in cm: ");
        float H = input.nextFloat();

        double area = 0.5*B*H;

        System.out.println("Your area is: "+area+" cms2");
    }
}
