import java.util.Scanner;

public class left_Shift {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Welcome To Bitwise Calculator\n\n");
        System.out.print("Please Enter What Point You Want to Shift: ");
        int point = input.nextInt();
        System.out.print("Please Enter In Which Number You Want to Apply: ");
        int num = input.nextInt();

        int lShift = num<<point;

        System.out.println("Your Output is: "+lShift);
    }
}
