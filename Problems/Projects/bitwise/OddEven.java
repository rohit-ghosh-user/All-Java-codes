import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Welcome to Odd Even Calculator");
        System.out.print("Enter your number: ");
        int num = input.nextInt();

       if((num&1)==1){
           System.out.println("You entered a odd number");
       }
       else{
           System.out.println("You entered a even number");
       }
    }
}
