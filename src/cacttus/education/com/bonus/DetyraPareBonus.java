package cacttus.education.com.bonus;

import java.util.Scanner;

public class DetyraPareBonus {
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //detyra1();
        //detyra8();
        detyra34();
    }

    /*
1.	Shkruaje aplikacionin në Java që lexon dy numra të plotë nga konsola. Në ato dy numra le të aplikohet
të gjitha operatorët aritmetik dhe të afishohen rezultatet. P.sh nëse 18 dhe 5 janë dy numra që lexohen
atëherë programi do të afishoj këtë output:
18 + 5 = 23
18 - 5 = 13
18 * 5 = 90
18 / 5 = 3
18 % 5 = 3

Shenim: Aty ku nuk mund te perdoret nje operatore per kalkulim te vlerave te caktuara te shfaqet mesazhi
se adekuat
     */

    public static void detyra1() {
        System.out.println("Shkruaj numrin e pare te plote: ");
        int nr1 = reader.nextInt();

        System.out.println("Shkruaj numrin e dyte te plote:");
        int nr2 = reader.nextInt();

        System.out.printf("%d + %d = %d", nr1, nr2, nr1 + nr2);
        System.out.printf("%n%d - %d = %d", nr1, nr2, nr1 - nr2);
        System.out.printf("%n%d * %d = %d", nr1, nr2, nr1 * nr2);
        if (nr2 != 0) {
            System.out.printf("%n%d / %d = %d", nr1, nr2, nr1 / nr2);
            System.out.printf("%n%d %s %d = %d", nr1, "%", nr2, nr1 % nr2);
        } else {
            System.out.println("\nLlogaritja e heresit dhe mbetjes nuk mund te behet kur pjesutesi eshte zero!!!");
        }

        //newline tek printf eshte %n
        //newline tek print dhe println eshte \n
    }

    /*
    8.	Shkruani programin që e gjen zgjidhjet e ekuacionit kuadratik me anë të formulës së mëposhtme.
     Trego rastin kur ekuacioni nuk ka zgjidhje.
     */


    public static void detyra8() {
        System.out.println("Shkruaj vleren per a = ");
        double a = reader.nextDouble();

        System.out.println("Shkruaj vleren per b = ");
        double b = reader.nextDouble();

        System.out.println("Shkruaj vleren per c = ");
        double c = reader.nextDouble();

        if (a != 0) {
            double sqrt = Math.sqrt(b * b - 4 * a * c);
            double x1 = (-b + sqrt) / (2 * a);
            double x2 = (-b - sqrt) / (2 * a);
            System.out.printf("x1 = %.2f%n", x1);
            System.out.printf("x2 = %.2f%n", x2);
        } else {
            System.out.println("Nuk eshte ekuacion kuadratik!!!");
        }
    }

    /*
    34.	Implemento një aplikacion që llogarit mesataret e provimeve.
     Numri i provimeve të pranohet nga përdoruesi. Gjithashtu gjeje vlerën maksimale

     */
    public static void detyra34() {
        //sentinel
        //me counter

        System.out.println("Shkruaj sa nota i ke marr: ");
        int nrNotave = reader.nextInt();

        double sum = 0;

        for (int i = 1; i <= nrNotave; i++) {
            System.out.printf("Shkruaj noten e %d:", i);
            int nota = reader.nextInt();
            sum += nota;
        }

        System.out.printf("Nota mesatare eshte %.2f", sum / nrNotave);

    }
}
