public class SwappingReverse {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reverse\n");
        int[] arr = ArrayUtility.inputArray();
        swapArr(arr);
        System.out.println("Here is your swap array");
        ArrayUtility.displayArray(arr);
    }
    public static void swapArr(int[] arr){
        int i = 0;
        while (i<arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
            i++;
        }
    }
}
