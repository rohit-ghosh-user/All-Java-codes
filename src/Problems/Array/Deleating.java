import java.util.Scanner;

public class Deleating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Enter your number which you want to delete: ");
        int num = input.nextInt();
        int[] newArr = deleateArray(arr,num);
        System.out.println("Here is your new array");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleateArray(int[] arr,int num){
        int occr = Occurrences.checkOccurrences( arr, num);
        if(occr==0){
            return arr;
        }
        int newSize = arr.length-occr;
        int[] newArr = new int[newSize];
        int i=0,j=0;
        while(i<arr.length){
            if(arr[i]!= num){
                newArr[j]=arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
