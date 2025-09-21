public class ReverseArry {
    public static void main(String[] args) {
        System.out.println("Welcome to ArrayUtility\n");
        int[] arr = ArrayUtility.inputArray();
        int[] newArr = reverseArray(arr);
        System.out.println("Here is your reverse array");
        ArrayUtility.displayArray(newArr);
    }
    public static int[] reverseArray(int[]arr){
        int[] newArr = new int[arr.length];
        int i = arr.length-1;
        int j = 0;
        while (i<=arr.length){
            if(j<arr.length){
                newArr[j] = arr[i];
                j++;
            }
            i--;
        }
        return newArr;
    }
}
