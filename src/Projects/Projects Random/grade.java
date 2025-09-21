import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Percentage: ");
        float grade = input.nextFloat();

        if(grade>=90){
            System.out.print("Congratulation You Get \"A\"");
        }
        else if(grade>=75 && grade<=90){
            System.out.print("Your Grade is \"B\"");
        }
        else if(grade>=60 && grade<=75){
            System.out.print("Your Grade is \"C\"");
        } else if (grade>=30 && grade<=60) {
            System.out.print("Your Grade is \"D\"");
        }
        else{
            System.out.print("Better Luck Next Time");
        }
    }
}
