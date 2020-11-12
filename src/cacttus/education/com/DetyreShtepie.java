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

//        System.out.println("Syprina e trekendeshit");
//        syprinaTrekendeshit();

//        System.out.println("Viktor Ahmeti");
//        beriTimaVA();
//        System.out.println("-------------------------------------------");
//        System.out.println("Resul Selmani");
//        beriTimaRS();

//        System.out.println("E-kuleta VA");
//        eKuletaVA();


        System.out.println("E-kuleta EH");
        eKuletaEH();
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

    public static void detyrePercjellja() {
        int parate_e_mija = 12;
        parate_e_mija = parate_e_mija - 5;
        parate_e_mija = parate_e_mija * 2;
        parate_e_mija = 1;
        System.out.println(parate_e_mija);
    }

    public static void detyrePercjellja2() {
        int parate_e_mija = 12;
        parate_e_mija -= 5;
        parate_e_mija *= 2;
        parate_e_mija = 1;
        System.out.println(parate_e_mija);
    }

    public static void hmmmCalculatoriMXH() {
        int x = 19;
        int y = 4;
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y));
    }

    public static void hmmmCalculatoriVA() {
        double nr1 = reader.nextDouble();
        double nr2 = reader.nextDouble();

        System.out.printf("%f + %f = %f %n", nr1, nr2, nr1 + nr2);
        System.out.printf("%f - %f = %f %n", nr1, nr2, nr1 - nr2);
        System.out.printf("%f * %f = %f %n", nr1, nr2, nr1 * nr2);
        System.out.printf("%f / %f = %f %n", nr1, nr2, nr1 / nr2);
        System.out.printf("%f %s %f = %f %n", nr1, "%", nr2, nr1 % nr2);
    }


    public static void beriTimaVA() {
        int euro = 33;
        int cent = 16;
        int totali = (100 * euro) + cent;
        System.out.printf("Bankenota 5 euro: %d %n", (totali / 500));
        totali = totali % 500;
        System.out.printf("Monedha 2 euro: %d %n", (totali / 200));
        totali = totali % 200;
        System.out.printf("Monedha 1 euro: %d %n", (totali / 100));
        totali = totali % 100;
        System.out.printf("Monedha 50 cent: %d %n", (totali / 50));
        totali = totali % 50;
        System.out.printf("Monedha 20 cent: %d %n", (totali / 20));
        totali = totali % 20;
        System.out.printf("Monedha 10 cent: %d %n", (totali / 10));
        totali = totali % 10;
        System.out.printf("Monedha 5 cent: %d %n", (totali / 5));
        totali = totali % 5;
        System.out.printf("Monedha 2 cent: %d %n", (totali / 2));
        totali = totali % 2;
        System.out.printf("Monedha 1 cent: %d %n", (totali / 1));
    }

    public static void beriTimaRS() {
        double euro = 33;
        double cent = 16;
        double parateTotal = (euro * 100) + cent;
        System.out.println("kah 5 euro i ki = " + euro / 5);
        System.out.println("kah 2 euro i ki = " + euro / 2);
        System.out.println("kah 1 euro i ki = " + euro / 1);
        System.out.println("kah 50 cent i ki = " + parateTotal / 50);
        System.out.println("kah 20 cent i ki = " + parateTotal / 20);
        System.out.println("kah 10 cent i ki = " + parateTotal / 10);
        System.out.println("kah 5 cent i ki = " + parateTotal / 5);
        System.out.println("kah 2 cent i ki = " + parateTotal /2);
        System.out.println("kah 1 cent i ki = " + parateTotal / 1);

    }

    public static void eKuletaVA() {
        System.out.print("Nje centeshe: ");
        int njeCent = reader.nextInt();
        System.out.print("Dy centeshe: ");
        int dyCent = reader.nextInt();
        System.out.print("Pese centeshe: ");
        int peseCent = reader.nextInt();
        System.out.print("Pesedhjete centeshe: ");
        int pesedhjeteCent = reader.nextInt();
        System.out.print("Nje euroshe: ");
        int njeEuro = reader.nextInt();
        System.out.print("Dy euroshe: ");
        int dyEuro = reader.nextInt();
        System.out.println();
        System.out.println("------------------------------------");
        System.out.printf("Nje centeshe: %d %.2f%n", njeCent, (double)(njeCent/100));
        System.out.printf("Dy centeshe: %d %.2f%n", dyCent, (double)(dyCent*2/100));
        System.out.printf("Pese centeshe: %d %.2f%n", peseCent, (double)(peseCent*5/100));
        System.out.printf("Pesedhjete centeshe: %d %.2f%n", pesedhjeteCent, (double)(pesedhjeteCent*50/100));
        System.out.printf("Nje euroshe: %d %.2f%n", njeEuro, (double)njeEuro);
        System.out.printf("Dy euroshe: %d %.2f%n", dyEuro, (double)(dyEuro*2));
        System.out.println("------------------------------------");
        System.out.printf("TOTALI: %.2f%n", (njeCent + dyCent*2 + peseCent*5 + pesedhjeteCent*50 + njeEuro*100 + dyEuro*200)/100.0);
    }


    public static void eKuletaEH() {
        System.out.println("Sa 1 centshe i ki : ");
        int nicentshe = reader.nextInt();
        double nicentshe1 = nicentshe * 0.01;
        System.out.println("Sa 2 centshe i ki : ");
        int dycentshe = reader.nextInt();
        double dycentshe1 = dycentshe * 0.02;

        System.out.println("Sa 5 centshe i ki : ");
        int pesecentshe = reader.nextInt();
        double pesecentshe1 = pesecentshe * 0.05;

        System.out.println("Sa 50 centshe i ki : ");
        int pesdhjetcentshe = reader.nextInt();
        double pesdhjetcentshe1  =pesdhjetcentshe * 0.50; // pjestimi /2

        System.out.println("Sa 1 euro i ki : ");
        int nieuro = reader.nextInt();
        double nieuro2 = nieuro  * 1.00;

        System.out.println("Sa 2 euro i ki : ");
        int dyeuro = reader.nextInt();
        double dyeuro1 = dyeuro * 2.00;
        double totali = nicentshe1+dycentshe1+pesecentshe1+pesdhjetcentshe1+nieuro2+dyeuro1;

        System.out.println("-----------------------");
        System.out.printf ("  1 centshe  : %4d  %8.2f %n  ",nicentshe,nicentshe1);
        System.out.printf (" 2 centshe  : %4d  %8.2f %n  ",dycentshe,dycentshe1);
        System.out.printf (" 5 centshe  : %4d  %8.2f %n  ",pesecentshe,pesecentshe1);
        System.out.printf (" 50 centshe : %4d  %8.2f %n  ",pesdhjetcentshe,pesdhjetcentshe1);
        System.out.printf (" 1 euro     : %4d  %8.2f %n  ",nieuro,nieuro2);
        System.out.printf (" 2 euro     : %4d  %8.2f %n  ",dyeuro,dyeuro1);
        System.out.println("-----------------------");
        System.out.printf(" Totali      : %12.2f", totali);
    }

}
