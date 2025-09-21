public class Maxima_Minima {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int max = checkMaxima(arr);
        int min = checkMinima(arr);
        System.out.println("Your maximum number is "+max);
        System.out.println("Your minimum number is "+min);



    }
    public static int checkMaxima(int[] arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int i =0;
        int max = arr[0];
        while (i<arr.length){
            if(arr[i]>=max){
                max=arr[i];
            }
            i++;
        }
        return max;
    }
    public static int checkMinima(int[] arr){
        int max = checkMaxima(arr);
        int min = max;
        int i = 0;
        while(i<arr.length){
            if(arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        return min;
    }
}
