import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Row Number You Want: ");
        int num1 = input.nextInt();
        ReverseLeftHalfPyramid(num1);
        PrintPattern(num1);
        RightHalfPyramid(num1);

    }
    public static void RightHalfPyramid(int num){
        System.out.println("\n Thats Right half pyramid");
        int rows = num;
        while (rows>0){
            //this loop prints spaces
            int j = 0;
            while(j<rows-1){
                System.out.print("  ");
                j++;
            }
            //this loop prints stars
            int i = 0;
            while(i <= (num - rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void ReverseLeftHalfPyramid(int num){
        System.out.println("\n Thats Reverse left half pyramid");
        int rows = num;
        while (rows>0){
            int i = 0;
            while (i<rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
    public static void PrintPattern(int num){
        System.out.println("\n Thats Left half pyramid");
        int rows = 0;
        while (rows<num){
            System.out.print("*");
            int i = 0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }
}
