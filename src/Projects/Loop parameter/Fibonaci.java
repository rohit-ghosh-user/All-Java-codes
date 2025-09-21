import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Last Upto Number: ");
        int num = input.nextInt();
        fibonaci(num);
    }
    public static void fibonaci(int num){
        if(num<0)return;
        System.out.print(" 0");
        if(num==0)return;
        System.out.print(" 1 ");
        int first = 0;
        int second =1;
        while(first+second<=num){
            int third = first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }

    }
}
