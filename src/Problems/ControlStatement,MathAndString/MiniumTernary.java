import java.util.Scanner;

public class MiniumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to minimum number checker\n");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        checkNum(num1,num2);
    }

    public static void checkNum(int num1,int num2){
        int minNum = num1<num2? num1:num2;
        System.out.println(minNum+" is the smallest number");
    }
}
