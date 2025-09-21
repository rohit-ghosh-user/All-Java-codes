import java.util.Arrays;
public class PlaindromArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
       int[] revArr = ReverseArry.reverseArray(arr);
       if(Arrays.equals(arr, revArr)){
           System.out.println("plaindrome");
       }
       else {
           System.out.println("not plaindrome");
       }
    }
   
}