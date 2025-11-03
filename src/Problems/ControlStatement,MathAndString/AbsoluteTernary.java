import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to absolute number\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int returnAbsolute = returnAbsolute(num);
        System.out.println("Your absolute number is "+returnAbsolute);
    }
    public static int returnAbsolute(int num){
        int absolute = num < 0 ? -num: num;
        return absolute;
    }
}
