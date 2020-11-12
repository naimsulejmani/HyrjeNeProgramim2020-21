package cacttus.education.com;

import java.util.Scanner;

public class DetyreShtepie {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Ligji njutonit");
//        ligjiDyteINjutonit();
//
//        System.out.println("Ligji gravitetit");
//        ligjiGravitetit();

        /*
                Shkurtesa per koment: Ctrl + /
         */


//        System.out.println("Syprina e katrorit");
//        syprinaKatrorit();

//        System.out.println("Syprina e drejtekendshit!");
//        syprinaDrejtekendeshit();

        System.out.println("Syprina e trekendeshit");
        syprinaTrekendeshit();


    }

    public static void ligjiDyteINjutonit() {
        //Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj masen e trupit: ");
        double masa = reader.nextDouble();

        System.out.println("Shkruaj nxitimin e trupit: ");
        double nxitimi = reader.nextDouble();

        double forca = masa * nxitimi; // F = m * a;
        System.out.printf("Forca eshte e barabarte: %.2f N", forca);
    }

    public static void ligjiGravitetit() {
        //Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj masen e trupit: ");
        double masa = reader.nextDouble();

        System.out.println("Shkruaj gravitetin: ");
        double graviteti = reader.nextDouble();

        double forca = masa * graviteti; // F = m * a;

        System.out.printf("Forca eshte e barabarte: %.2f N", forca);
    }

    public static void syprinaKatrorit() {
        //Scanner reader=new Scanner(System.in);
        System.out.println("Sheno madhesine e brinjes se katrorit: ");
        double brinjaA = reader.nextDouble();
        double syprina = brinjaA * brinjaA;
        //syprina=Math.pow(brinjaA,2);
        System.out.printf("Syprina e katrorit me brinje %.2f eshte e barabarte me:%.2f m2", brinjaA, syprina);
    }

    /*
            Metodat statike -> i shohin vetem metodat tjera statike dhe variablat statike
     */
    public static void syprinaDrejtekendeshit() {
        //S = a * b;
        System.out.println("Shkruaj brinjen a: ");
        double a = reader.nextDouble();
        System.out.println("Shkruaj brinjen b: ");
        double b = reader.nextDouble();
        double syprina = a * b;
        System.out.printf("Syprina e drejtkendeshit me brinje %.2f dhe %.2f eshte e barabarte me %.2f",
                a, b, syprina);
    }

    public static void syprinaRrethit() {
        //S = pi * r*r
        System.out.println("Shkruaj rrezen r: ");
        double r = reader.nextDouble();
        double syprina = Math.PI * r * r;

        //souf
        System.out.printf("Syprina e rrethit me rreze %.2f eshte e barabarte me %.2f", r, syprina);
    }

    public static void syprinaTrekendeshit() {
        //S = (a*h)/2;
        System.out.println("Shkruaj brinjen a: ");
        double a = reader.nextDouble();
        System.out.println("Shkruaj lartesine h: ");
        double h = reader.nextDouble();
        double syprina = (a * h) / 2;
        System.out.printf("Syprina e trekendeshit me brinje %.2f dhe lartesi %.2f eshte e barabarte %.2f",
                a, h, syprina);
    }
}
