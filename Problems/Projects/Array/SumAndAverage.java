import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("welcome to Array");
        int[] arr = ArrayUtility.inputArray();
        long forSum = sum(arr);
        double forAvg = avg(arr);
        System.out.println("Your sum is: "+forSum);
        System.out.println("Yor average is: "+forAvg);
    }

    public static long sum(int[]arr){
        int i = 0;
        int sum = 0;
        while(i<arr.length){
            sum = sum+arr[i];
            i++;
        }
        return sum;
    }

    public static double avg(int[]arr){
        double sum = sum(arr);
        double avg =  sum/arr.length;
        return avg;
    }
}
