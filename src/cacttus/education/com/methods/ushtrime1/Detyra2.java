package cacttus.education.com.methods.ushtrime1;

public class Detyra2 {
    public static void main(String[] args) {
        //printNumbers(20);
        // shtypjaNumrave(20);
        int[] array = {45, 454};
        //printArray(array);

        array = new int[]{1, 3, 6, 4, 30, 6, 7, 11, 9};
        //printArray(array);

        //shtypjaArray(new int[]{10, 20, 30});

        int[][] array2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

       // shtypMatricen(array2d);

        printArray2D_forin(array2d);

    }

    // Viktori
    public static void printNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }

    //Ensari
    public static void shtypjaNumrave(int numri) {
        int a = 1;
        for (; a <= numri; a++) {
            System.out.println(a + "");
        }
    }

    // Viktori
    public static void printArrayVA(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //   Mirlinda
    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Ensari
    public static void shtypjaArray(int array[]) {
        for (int numri : array) {
            System.out.println(numri + "");
        }
    }

    //viktori
    public static long factoriel(int N) {
        long factoriel = 1;

        for (int i = N; i > 1; i--) {
            factoriel *= i;
        }

        return factoriel;
    }


    //  mIRLINDA
    static int factorial(int number) {

        int factorial = 1;

        for (int i = 1; i <= number; ++i) {

            factorial *= i;
        }
        //   System.out.printf("Factorial of %d = %d", number, factorial);
        return number;
    }


    //Viktori
    public static void printArray2D(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // ensari

    public static void shtypMatricen(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%10d", array[i][j]);
            }
            System.out.println();
        }
    }

    //viktori me for-in ose for-each
    public static void printArray2D_forin(int[][] array2d) {
        for (int[] array : array2d) {
            for (int nr : array) {
                System.out.printf("%10d", nr);
            }

            System.out.println();
        }
    }

}
