import java.util.Scanner;

public class SearchingArray2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int[][] arr =  ArrayUtility.twoDimentionArray();
        System.out.println("Enter the number which your want to check: ");
        int num = input.nextInt();
       boolean isExist = isExist(arr,num);
       if(isExist){
           System.out.println("Yor number was in array");
       }
       else {
           System.out.println("Your number was not in array");
       }
    }
    public static boolean isExist(int[][]arr,int num){
        int i = 0;
        while (i<arr.length){
            int j= 0;
            while(j<arr[i].length){
                if(arr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
