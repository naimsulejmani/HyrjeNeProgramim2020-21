package cacttus.education.com.arrays.foreach;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        //rsSlideMatrix();
        slide1detyra();
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
}
