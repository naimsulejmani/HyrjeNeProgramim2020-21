package cacttus.education.com.decisions;

import java.util.Scanner;

public class Detyraa1 {
    public static void main(String[] args) {
        //d1ViktorAhmeti();
        //d1EnsarHoxha();
        //d1d2ResulSelmani();
        //d2ViktorAhmeti();
    }

    public static void d1d2ResulSelmani() {
        Scanner vlera = new Scanner(System.in);
        System.out.println("Shkruaj numrin e pare");
        int numriPare = vlera.nextInt();
        System.out.println("Shkruaj numrin e dyte");
        int numriDyte = vlera.nextInt();
        if (numriPare % numriDyte == 0) {
            System.out.printf("Numri %d eshte i plotpjesetueshem me numrin %d", numriPare, numriDyte);
        } else {
            System.out.printf("Numri %d nuk eshte i plotpjesetueshem me numrin %d", numriPare, numriDyte);
        }

        if (numriDyte % numriPare == 0) {
            System.out.printf("\nNumrat %d dhe %d jane te plotpjesetueshem mes vete", numriPare, numriDyte);
        } else {
            System.out.printf("Numri i pare eshte i plotpjesetueshem me numrin e dyte");
        }
    }

    public static void d1EnsarHoxha() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Numri i pare : ");
        int a = reader.nextInt();
        System.out.println("Numri i dyte : ");
        int b = reader.nextInt();
        if (a % b == 0) {
            System.out.printf("%d eshte i plotepjestushem me %d ", a, b);
        } else {
            System.out.printf("%d nuk eshte i plotepjestushem me %d ", a, b);
        }
    }

    public static void d2ViktorAhmeti() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();


        if (y != 0) {
            if (x % y == 0)
                System.out.printf("Numri %d eshte i plotpjestueshem me numrin %d", x, y);
            else
                System.out.printf("Numri %d NUK eshte i plotpjestueshem me numrin %d", x, y);
        }
        else
            System.out.println("Invalid");


        if (x != 0) {
            if (y % x == 0)
                System.out.printf("Numri %d eshte i plotpjestueshem me numrin %d", y, x);
            else
                System.out.printf("Numri %d NUK eshte i plotpjestueshem me numrin %d", y, x);
        } else
            System.out.println("Invalid");
    }

    public static void d1ViktorAhmeti() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shkruani numrin e pare: ");
        int x = scan.nextInt();
        System.out.println("Shkruani numrin e dyte: ");
        int y = scan.nextInt();

        if (y == 0)
            System.out.println("Invalid");
        else if (x % y == 0)
            System.out.println("Numri i pare eshte i plotepjestueshem me te dytin");
        else
            System.out.println("Numri i pare NUK eshte i plotepjestueshem me te dytin");
    }
}
