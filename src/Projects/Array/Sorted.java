public class Sorted {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        if(arr.length==0){
            System.out.println("It's not valid");
            return;
        }
        isIncreasing(arr);
        isDecreasing(arr);
        if(isIncreasing(arr)||isDecreasing(arr)){
            System.out.println("It was a sorted array");
        }
        else {
            System.out.println("It was not a sorted array");
        }
    }
    public static boolean isIncreasing(int[] arr){
        int i = 1;
        while(i<arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[]arr){
        int i = 1;
        while (i<arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}

