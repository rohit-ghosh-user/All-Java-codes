import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num = input.nextInt();
        int result = checkNumber(num);
       if (result==num){
           System.out.println(result+" is a Amstrong Number");
       }
       else {
           System.out.println(num+" Its not a Amstrong Number");
       }


    }
    public static int checkNumber(int num){
        int count = 0;
        int digit = 0;
        int ans = 0;
        while (num>0){
            digit =num%10;
            ans = ans*10+digit;
            num = num/10;
            count++;

        }
         int finalNumber = 0;
        while(ans>0){
            int number = ans%10;
             finalNumber += pow( number,  count);
            ans = ans/10;
        }
        return finalNumber;


    }
    public static int pow(int number,int count){
        int power = number;
        int i = 1;
        while(i<count){
            power *= number;
            i++;
        }
        return power;
    }
}
