public class SumAve2dArray {
    public static void main(String[] args) {
      int[][] arr =   ArrayUtility.twoDimentionArray();
      int sum = sumArr(arr);
      double ave = aveArr(arr);
        System.out.println("Your sum of array is "+sum);
        System.out.println("Your average of array is "+ave);


    }
    public static int sumArr(int[][] arr){
        int i = 0;
        int sum = 0;
        while (i<arr.length){
            int j = 0;
            while (j<arr[i].length){
                sum = sum+arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double aveArr(int[][] arr){
        int sum = sumArr(arr);
        double ave = (double) sum /((arr.length)*(arr.length));
        return ave;
    }
}

