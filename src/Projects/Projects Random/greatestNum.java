import java.util.Scanner;

public class greatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter Your Second Number: ");
        float num2 = input.nextFloat();
        System.out.print("Enter Your Third Number: ");
        float num3 = input.nextFloat();

        if(num1>=num2 && num1>=num3){
            System.out.println("The Greatest Number is: "+num1);
        }

        else if(num2>=num3){
            System.out.println("The Greatest Number is: "+num2);
        }
        else {
            System.out.println("The Greatest Number is: "+num3);
        }
    }
}
