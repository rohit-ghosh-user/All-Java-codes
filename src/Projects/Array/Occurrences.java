import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter your number which you want to check: ");
        int num = input.nextInt();
        int checkOccurrences = checkOccurrences(arr,num);
        System.out.println("Your number found "+checkOccurrences+" time");
    }
   public static int checkOccurrences(int[] arr, int num){
        int occ = 0;
        int i = 0;
        while (i<arr.length){
            if(num==arr[i]){
                occ = occ+1;
            }
            i++;
        }
        return occ;
    }
}
