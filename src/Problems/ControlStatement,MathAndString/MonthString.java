import java.util.Scanner;

public class MonthString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to month of the year \n");
        System.out.print("Enter your month number : ");
        int monthNo = input.nextInt();
        returnMonth(monthNo);
    }

    public static void returnMonth(int monthNo){
        String monthName = switch (monthNo){
            case 1-> "January";
            case 2-> "February";
            case 3-> "March";
            case 4-> "April";
            case 5-> "May";
            case 6-> "June";
            case 7-> "July";
            case 8-> "August";
            case 9-> "September";
            case 10-> "October";
            case 11-> "November";
            case 12-> "December";
            default -> "Invalid";

        };
        System.out.println("Your month is "+monthName);
    }
}
