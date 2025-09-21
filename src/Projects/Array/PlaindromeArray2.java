public class PlaindromeArray2 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
      boolean checkPlaindrome =  isPlaindrome(arr);
      if(checkPlaindrome){
          System.out.println("Your array is a plaindrome array");
      }
      else {
          System.out.println("Your array is not a plaindrome array");
      }
    }
    public static boolean isPlaindrome(int[]arr){
        int i = 0;
        while (i<arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
            if(arr[i] != swap){
                return false;
            }
            i++;
        }
        return true;
    }
}
