import java.util.Scanner;

public class Sum_odd {
    public static void main(String[] args) {
        greetUser();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int number = input.nextInt();
        int sum = readNumbers(number);
        System.out.println("odd sum till "+number+" and sum is: "+sum);
    }
    public static int readNumbers(int num){

        int i = 1;
        int sum = 0;
        while(i<=num){
            sum +=i;

            i+=2;
        }
        return sum;
    }

    public static void greetUser(){
        System.out.println("Welcome to Odd calculator\n");
    }
}
