import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        float num = input.nextFloat();

        if(num>=0){
            System.out.println("The value is positive");

        }
        else {
            System.out.println("The value is negetive");
        }
    }
}
