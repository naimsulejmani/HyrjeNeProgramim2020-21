package cacttus.education.com.arrays.ushtrime1;

import java.util.Scanner;

public class Detyra3 {
    public static void main(String[] args) {
        int[] array;
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj vleren e N: ");
        int n = reader.nextInt();
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
            //Math.random() -> gjeneron nje numer prej 0.00 deri ne 0.9999999999
        }

        System.out.println("Shtypja prej indeksit 0 deri ne 99");
        int j = 0;
        while (j < array.length) {
            System.out.printf("%5d", array[j]);
            j++;
        }
        System.out.println("\nShtypja prej indeksit 99 deri ne 0");

        j = array.length - 1;
        do {
            System.out.printf("%6d", array[j]);
            j--;
        }
        while (j >= 0);

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("\nShuma e vargut eshte = " + sum);
    }

    //1. Te gjendet shuma e numrave tek te vargut te random
    //2. Te gjendet shuma e numrave cift ne indeksat cift te vargut random
    //3. Te gjendet vlera minimale ne varg
    //4. Te gjendet vlera maksimale ne varg
}
