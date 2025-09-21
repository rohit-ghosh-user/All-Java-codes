import java.util.Scanner;

public class age_grups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = input.nextInt();

        if(age>=60){
            System.out.println("You are a Old");
        }
        else if(age>=18 && age<=60){
            System.out.println("Your are a Adult");
        }
        else if(age>=10 && age<=17){
            System.out.println("You are a Teenager");
        }
        else{
            System.out.println("You are a Child");
        }
    }
}
