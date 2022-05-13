import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Matrix {
    public static Scanner scan = new Scanner(System.in);
    private static ArrayList;

    public static ArrayList<Integer> main(String[] args) {
        System.out.print("Enter the number of elements in a row: ");
        int n = scan.nextInt();
        System.out.print("Enter the number of elements in a column: ");
        int m = scan.nextInt();
        int[][] array = new int[n][m];

        if(n ==0||m ==0) {
            System.out.println("There are no elements in the" +
                    " given 2d array.");
        }
        else {
            System.out.println("Enter the elements for the 2d array: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            System.out.println("2D array = " +
                    Arrays.deepToString(array));
            System.out.println("The minimum value in the given" +
                    " 2d array is: " + getMinimumIn2DArray(array));
        }
        scan.close();


        private static ArrayList;
    public static int getMinimumIn2DArray(int[][] number) {
        int minimum = number[0][0];
        for (int j = 0; j < number.length; j++) {
            for (int i = 0; i < number[j].length; i++) {
                if (number[j][i] < minimum) {
                    minimum = number[j][i];
                }
            }
        }
        return minimum;
    }
    public void testNumbersDivisibleByThree() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };
        public static ArrayList<Integer> testNumbersDivisibleByThree(ArrayList<Integer> list) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for (int number : list) {
            if (number % 3 == 0) {
                sublist.add(number);
            }
        }
        return sublist;
    }

    public static ArrayList<Integer> selectNumbers() {
        ArrayList<Integer> sublist = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 3 == 0) {
                    sublist.add(array[i][j]);
                }
            }
        }
        return sublist;
    }
}