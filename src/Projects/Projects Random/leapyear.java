import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Plse Enter Your Year: ");
        int year = input.nextInt();

        if( year%400==0){
            System.out.println("Youre Year is LEPEAR");
        } else if (year%4==0 && year%100!=0 ) {
            System.out.println("Your Year is Lepear");
        } else{
            System.out.println("Its Not A LEPEAR");
        }
    }
}
