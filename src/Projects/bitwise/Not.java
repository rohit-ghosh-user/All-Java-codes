import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Please Enter Your First Number: ");
        int num = input.nextInt();


        int not = ~num;

        System.out.println("Your Output is: "+not);


    }
}
