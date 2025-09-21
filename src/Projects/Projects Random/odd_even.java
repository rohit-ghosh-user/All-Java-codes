import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Number: ");
        float num = input.nextFloat();

        if (num<=0) {
            System.out.println("Its not possible");

        } else if(num%2==0){
            System.out.println("You Enter A Even Number");

        } else{
            System.out.println("You Enter A Odd Number");
        }

    }
}
