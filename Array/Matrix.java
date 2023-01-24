package Array;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Matrix Rows");
        int matrixRows = sc.nextInt();
        System.out.println("Enter Matrix Columns");
        int matrixCols = sc.nextInt();
        int[][] matrix = new int[matrixRows][matrixCols];
        enterMatrixData(sc, matrix, matrixRows, matrixCols);
        printMatrix(matrix, matrixRows, matrixCols);

    }

    public static void enterMatrixData(Scanner sc, int[][] matrix,int matrixRows,int matrixCols){
        System.out.println("Enter matrix data");
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixCols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix,int matrixRows,int matrixCols){
        System.out.println("You entered matrix data is: ");
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixCols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
