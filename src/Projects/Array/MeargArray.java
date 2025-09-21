
public class MeargArray {
    public static void main(String[] args) {
        System.out.println("Enter Your First Array");
        int[] arr1 = ArrayUtility.inputArray();
        System.out.println("Enter your second Array");
        int[] arr2 = ArrayUtility.inputArray();
        int[] newArray = meargeArray(arr1,arr2);
        System.out.println("Here is your mearged array");
        ArrayUtility.displayArray(newArray);
    }
    public static int[] meargeArray(int[]arr1,int[]arr2){
        int[] newArr = new int[arr1.length+arr2.length];
        int i = 0, j = 0, k = 0;
        while (i<arr1.length||j<arr2.length){
            if(j==arr2.length||((i<arr1.length && arr1[i]<arr2[j]))){
                newArr[k]= arr1[i];
                i++;
                k++;
            }
            else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}
