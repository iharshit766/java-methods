import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
    // Method to generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values from 0 to 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Computing determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Computing determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Inverse does not exist.");
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to display a double matrix (for inverse)
    public static void displayDoubleMatrix(double[][] matrix) {
        if (matrix == null) return;
        
        for (double[] row : matrix) {
            for (double num : row) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for matrix size
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Generating two random matrices
        int[][] A = generateMatrix(rows, cols);
        int[][] B = generateMatrix(rows, cols);

        // Displaying matrices
        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        // Performing and displaying operations
        System.out.println("Matrix Addition:");
        displayMatrix(addMatrices(A, B));

        System.out.println("Matrix Subtraction:");
        displayMatrix(subtractMatrices(A, B));

        if (rows == cols) {
            System.out.println("Transpose of Matrix A:");
            displayMatrix(transposeMatrix(A));

            if (rows == 2) {
                System.out.println("Determinant of Matrix A (2x2): " + determinant2x2(A));
                System.out.println("Inverse of Matrix A:");
                displayDoubleMatrix(inverse2x2(A));
            } else if (rows == 3) {
                System.out.println("Determinant of Matrix A (3x3): " + determinant3x3(A));
            }
        }

        // Multiplication (only possible if cols(A) == rows(B))
        if (A[0].length == B.length) {
            System.out.println("Matrix Multiplication (A * B):");
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("Matrix multiplication not possible with given dimensions.");
        }

        scanner.close();
    }
}
