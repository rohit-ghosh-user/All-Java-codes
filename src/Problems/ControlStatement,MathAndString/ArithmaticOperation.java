import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to arithmatic operation\n");

        System.out.print("Enter what operation you want (+,-,*,/): ");
        String Operator = input.next();
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        arithmatic (Operator, num1 , num2);

    }

    public static void arithmatic(String Operator,int num1,int num2) {
        int result = switch (Operator){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            default  -> -1;
        };
        System.out.println("Your ans is: "+result);
    }
}
