import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter length of array : ");
        int x = scanner.nextInt();
        System.out.printf("Enter length is arr[%d] : ", x);
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            int[][] arr = new int[x][y];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("arr[%d][%d] = ", i, j);
                    arr[i][j] = scanner.nextInt();
                }
            }
            int max = getMax(arr);
            System.out.printf("Max = %d", max);
        }else {
            System.out.printf("invalid input !!");
        }
    }

    public static int getMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
