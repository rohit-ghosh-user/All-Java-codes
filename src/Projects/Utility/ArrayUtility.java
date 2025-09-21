import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Array size: ");
        int size = input.nextInt();
        int[] nums = new int[size];

        int i = 0;
        while(i<size){
            System.out.print("Enter your array element no."+(i+1)+": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static void displayArray(int[]arr){
        int i = 0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }
    public static int[][] twoDimentionArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your array's column size: ");
        int cSize = input.nextInt();
        System.out.print("Enter your array's row size: ");
        int rSize = input.nextInt();
        int[][] ddArray = new int[rSize][cSize];

        int i = 0;
        while (i<rSize){
            int j = 0;
            while (j<cSize){
                System.out.print("Enter your row"+(i+1)+",column"+(j+1)+": ");
                ddArray[i][j]=input.nextInt();
                j++;
            }
            i++;
        };
        return ddArray;
    }
}
