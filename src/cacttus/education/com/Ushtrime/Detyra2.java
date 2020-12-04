package cacttus.education.com.Ushtrime;

import java.util.Scanner;

public class Detyra2 {
    static final double TOLERANCE = 0.000000001;

    public static void main(String[] args) {
        detyra1EnsarHoxha();
    }

    public static void detyra1EnsarHoxha() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani gjatesin e drejtkendeshit: ");
        int gjatsia = reader.nextInt(); //double
        System.out.println("Shkruani gjersine e drejtkendeshit: ");
        int gjersia = reader.nextInt(); // double
        if (gjatsia == gjersia) { //  Math.abs(gjatesia-gjersia)<TOLERANCE
            System.out.println("Drejtkendeshi eshte katror");
        } else {
            System.out.println("Drejtkendeshi nuk eshte katror");
        }
    }


    public static void detyra2() {

    }

    public static void detyra3() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj sasine: ");
        double sasia = reader.nextDouble();

        double vlera = sasia * 100;

        if (vlera > 1000)
            System.out.println("Kosto totale: " + vlera * 0.9);
        else
            System.out.println("Kosto totale: " + vlera);

        //System.out.println("Kosto totale: " + (vlera > 1000 ? vlera * 0.9 : vlera));
    }

    public static void detyra4() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj se sa vite punoni: ");
        int vitePune = reader.nextInt();
        System.out.println("Shkruani pagen: ");
        double paga = reader.nextDouble();

        if (vitePune > 5)
            System.out.println("Paga neto: " + paga * 1.05);
        else
            System.out.println("Paga neto: " + paga);
        //operatori ternary ?:
        //System.out.println("Paga neto: " + (vitePune > 5 ? paga * 1.05 : paga));
    }
}
