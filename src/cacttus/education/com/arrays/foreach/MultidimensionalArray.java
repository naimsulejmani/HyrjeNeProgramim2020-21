package cacttus.education.com.arrays.foreach;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        //rsSlideMatrix();
        //slide1detyra();
        zbritjaMatrices();
    }

    public static void rsSlideMatrix() {
        //inicializimi i matrices -> i vektorit te vektoreve
        //array i arrayeve = > array2Dimensional 3x3
        int[][] matrix = {{1, 2, 3}, {3, 4, 1}, {1, 2, 3}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%10d", matrix[i][j]);
            }
            System.out.println();
        }
    }


    public static void slide1detyra() {
        Scanner reader = new Scanner(System.in);
        int[][] matrix = new int[2][2]; // deklarimi i matrices array2d 2x2

        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int colIndex = 0; colIndex < matrix[rowIndex].length; colIndex++) {
                System.out.printf("Shkruaj vleren per Matrix[%d,%d]=", rowIndex + 1, colIndex + 1);
                matrix[rowIndex][colIndex] = reader.nextInt();
            }
        }
        //printimi i matrices
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%10d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    //&nbsp; <p>&nbsp;&nbsp;&nbsp;&nbsp;NAIM
    private static void zbritjaMatrices() {
        Scanner reader = new Scanner(System.in);
        int[][] a = new int[2][2];
        for (int rowIndex = 0; rowIndex < a.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < a[rowIndex].length; columnIndex++) {
                System.out.printf("Shkruaj vleren per Matricen e pare[%d, %d]: ", rowIndex + 1, columnIndex + 1);
                a[rowIndex][columnIndex] = reader.nextInt();
            }
        }
        int[][] b = new int[2][2];
        for (int rowIndex = 0; rowIndex < b.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < b[rowIndex].length; columnIndex++) {
                System.out.printf("Shkruaj vleren per Matricen e dyte[%d, %d]: ", rowIndex + 1, columnIndex + 1);
                b[rowIndex][columnIndex] = reader.nextInt();
            }
        }
        int c[][] = new int[2][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
