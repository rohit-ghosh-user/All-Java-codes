import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter Your Second Number: ");
        int secondNum = input.nextInt();
        int sum = returnLcm(firstNum, secondNum);
        System.out.println(sum);


    }

    public static int returnLcm(int num1, int num2) {
        int i = 1;
        while(true){
            int multiply = num1*i;
            if(multiply % num2 == 0){
                return multiply;
            }
            i++;
        }

    }
}
