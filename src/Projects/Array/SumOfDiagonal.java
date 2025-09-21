public class SumOfDiagonal {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.twoDimentionArray();
        int firstSum = firstDiagonal(arr);
        int secondSum = secondDiagonal(arr);
        int totalSum = firstSum+secondSum;
        if(arr.length%2 != 0){
            int realSum = totalSum-arr[(arr.length-1)/2][(arr.length-1)/2];
            System.out.println("Your sum is "+realSum);
        }
        else {
            System.out.println("Your sum is "+totalSum);
        }


    }
    public static int firstDiagonal(int[][]arr){
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i<arr.length){
            sum = sum+arr[i][j];
            i++;
            j++;
        }

        return sum;
    }
    public static int secondDiagonal(int[][]arr){
        int sum = 0;
        int i = arr.length-1;
        int j = arr.length-1;
        while (i>=0){
            sum = sum+arr[i][j];
            i--;
            j--;
        }

        return sum;
    }
}
