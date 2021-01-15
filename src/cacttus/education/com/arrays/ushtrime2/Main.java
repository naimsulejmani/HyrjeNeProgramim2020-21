package cacttus.education.com.arrays.ushtrime2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //mbledhjaEMatricave();

        generateMatrix();
        //mirlindaTransposeMatrix();
    }


    public static void generateMatrix() {
        int[][] matrix; //deklarimi i matrices  - pointon ne NULL
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj se me sa rreshta e deshiron matricen: ");
        int row = reader.nextInt();
        System.out.println("Shkruaj se me sa kolona e deshiron matricen: ");
        int col = reader.nextInt();
        matrix = new int[row][col]; //inicializohet dhe zend vend ne memorie (vlerat e tyre jane te mbushura me 0)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10000 + 1);
            }
        }
        //1. te shtypet matrica duke perdorur for
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%6d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("SHTYPJA ME FOR-EACH");
        //2. te shtypet matrica duke perdorur foreach
        for (int[] array : matrix) {
            for (int nr : array) {
                System.out.printf("%6d", nr);
            }
            System.out.println();
        }

        //3. Shtypja e diagonles se matrices - Mirlinda Xhelili
        System.out.println("Diagonalja: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + ", ");
                }
            }
        }
        System.out.println("");


        //4. Shtypja e diagonles se matrices
        System.out.println("Diagonalja dhe poshte saj: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i >= j) {
                    System.out.printf("%6d", matrix[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("");


        //4. Shtypja e diagonles se matrices
        System.out.println("Diagonalja dhe larte saj: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i <= j) {
                    System.out.printf("%6d", matrix[i][j]);
                } else {
                    System.out.printf("%6s", " ");
                }
            }
            System.out.println();
        }
        System.out.println("");


        //kodin per transpose te matries nga En-Gashi i permirsuar nga une (Naim Sulejmani)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            System.out.println();
        }

        System.out.println("Without transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("After Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void mirlindaTransposeMatrix() {
        int matrix[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};

        int transpose = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = transpose;
            }
        }

        System.out.println("Without transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("After Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }

    public static void mbledhjaEMatricave() {
        int[][] a = new int[2][2]; //deklarimi dhe inicializimi i matrices a i rendit 2 me 2;

        //int[][] b = a; // b-ja e merr refernces e matrices a ku pointon ne memorie
        // matrica a dhe b kane refenrece te njejte po e ndryshuam njeren vlere te cilesdo do te ndryshohet edhe tjetra

        int[][] b = new int[2][2];

        //tipet primitive ndryshojne vlere
        //tiper reference ndryshojne adresa memorie dhe sheh objekt tjeter
        //b=a;

        int[][] c = new int[2][2];


        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) { //for loopa per rresht
            for (int j = 0; j < a[i].length; j++) { // for loopa per kolone
                System.out.printf("Shkruaj vleren per A[%d,%d]=", i + 1, j + 1);
                a[i][j] = reader.nextInt();
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("Shkruaj vleren per B[%d, %d]=", i + 1, j + 1);
                b[i][j] = reader.nextInt();
            }
        }

        //mbledhja e matricave
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.printf("%4d", c[i][j]);
            }
            System.out.println();
        }


    }
}
