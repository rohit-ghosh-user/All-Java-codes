import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student score\n");
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();
        String grade = returnScore(marks);
        System.out.println("Your grade is "+grade);
    }

    public static String returnScore(int marks){
        String grade = marks > 80 ? "High" : (marks > 50 ? "Medium" : "Low");
        return grade;
    }
}
