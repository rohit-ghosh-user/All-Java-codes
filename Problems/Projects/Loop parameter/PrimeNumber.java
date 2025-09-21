import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Calculator");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        boolean result = isPrime(num);
        if(result){
            System.out.println("Its a prime number");
        }
        else {
            System.out.println("Its not a prime number");
        }

    }

    public static boolean isPrime(int num1){

          int i = 2;
          while (i<num1){

              if(num1%i==0){
                  return false;
              }
              i++;

          }
        return true;
    }

}
