import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter Your Second Number: ");
        int secondNum = input.nextInt();

        int sum = firstNum+secondNum;
        System.out.println("Your sum is: "+sum);
        int div = firstNum-secondNum;
        System.out.println("Your division is: "+div);
        int multi = firstNum*secondNum;
        System.out.println("Your multiplication is: "+multi);
        int subsctration = firstNum/secondNum;
        System.out.println("Your subsctration is: "+subsctration);
        int modulo = firstNum%secondNum;
        System.out.println("Your remainder is: "+modulo);

        //floating use

        System.out.println("\n\nEnter Your First Floating Number: ");
        float fNumber = input.nextFloat();
        System.out.println("Enter Your Second Floating Number: ");
        float sNumber = input.nextFloat();

        float sum1 = fNumber+sNumber;

        System.out.println("Your product is ready: "+sum1);

    }
}


