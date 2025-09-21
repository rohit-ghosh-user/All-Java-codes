import java.util.Scanner;

public class Table{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greet();
        System.out.println("Enter Your Number: ");
        int num = input.nextInt();
        System.out.println(num);
        table(num);
    }

    public static void greet(){
        System.out.println("Welcome to Table Creator Platform");
    }

    public static void table(int num){
        int i = 0;
        while(i<=10){
            System.out.println(num+"X"+i+"="+(num*i));
            i++;
        }
    }

}