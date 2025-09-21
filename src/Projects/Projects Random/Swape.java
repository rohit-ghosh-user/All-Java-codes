import java.util.Scanner;

public class Swape {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter value of your First number: ");
            int firstNum = input.nextInt();
            System.out.print("Enter value of your Second number: ");
            int secondNum = input.nextInt();

            System.out.println("Your First Number= "+firstNum);
            System.out.println("Your Second Number= "+secondNum);
            // swape number;
            int blank = firstNum;

            firstNum = secondNum;
            secondNum = blank;
            System.out.println("After swaping First Number is: "+firstNum);
            System.out.println("And Second Number is: "+secondNum);



        }
    }

