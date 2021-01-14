package cacttus.education.com.arrays.foreach;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 99, -95, 4, 87, 67, 0, 1, 2, 3};
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("Shuma e vargut = " + total);
        total = 0;
        //foreach
        for (int numri : array) {
            total += numri;
            System.out.printf("%4d",numri);
        }
        System.out.println("\n\nShuma e vargut = " + total);
    }
}
