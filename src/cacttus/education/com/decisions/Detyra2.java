package cacttus.education.com.decisions;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
            d2ViktoAhmeti();
    }

    public static void d2RionHasolli() {
        Scanner nxx = new Scanner(System.in);
        int numri = nxx.nextInt();
        int numri2 = nxx.nextInt();
        System.out.println("shtype ndonje numer me operator te ndryshem");
//ketu mungon zgjedh
        if (numri == '+') {

            System.out.println(numri + numri2);

        }

       else if (numri == '-') {


            System.out.println(numri - numri2);
        }

       else if (numri == '%') {

            System.out.println(numri % numri2);
        }
    }

    public static void d2ResulSelmani() {


        Scanner vlera = new Scanner(System.in);
        System.out.println("Shkruaj vleren e pare");
        int vleraPare = vlera.nextInt();
        System.out.println("Shkruj vleren e dyte");
        int vleraDyte = vlera.nextInt();
        System.out.println("Shkruaj operatorin");
        String operatori = vlera.next();
        if (vleraPare == 0 || vleraDyte == 0) {
            System.out.println("Vlera nuk mund te kalkulohet");
        } else {
            if (operatori.equals("+")) {
                System.out.println(vleraPare + vleraDyte);
            } else if (operatori.equals("-")) {
                System.out.println(vleraPare - vleraDyte);
            } else if (operatori.equals("*")) {
                System.out.println(vleraPare * vleraDyte);
            } else if (operatori.equals("/")) {
                System.out.println(vleraPare / vleraDyte);
            }
            else if (operatori.equals("%")) {
                System.out.println(vleraPare % vleraDyte);
            }
        }

    }

    public static void d2EnsarHoxha() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa eshte numri i pare = ");
        int nr1 = reader.nextInt();
        System.out.println("Sa eshte numri i dyte = ");
        int nr2 = reader.nextInt();
        reader.nextLine();
        System.out.println("Cili eshte veprimi qe doni ta kryeni");
        String veprimi = reader.nextLine();
        //Objektet nuk mundemi me i krahasu me operatoret e krahasimit ==, >, <, ..

        //duhet me perdore metoden equals, compareTo
        if (veprimi == "+") {
            int a = nr1 + nr2;
            System.out.println(a);
        } else if (veprimi == "-") {
            int b = nr1 + nr2;
            System.out.println(b);
        } else if (veprimi == "*") {
            int c = nr1 * nr2;
            System.out.println(c);
        } else if (veprimi == "/") {
            int d = nr1 * nr2;
            System.out.println(d);
        } else {
            System.out.println("Keni gabuar operatorin");
        }
    }

    public static void d2ViktoAhmeti() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shkruaj numrin e pare: ");
        int nr1 = scan.nextInt();
        System.out.println("Shkruaj numrin e dyte: ");
        int nr2 = scan.nextInt();
        System.out.println("Zgjidh operatoret (+, -, *, /, %): ");
        //lexo si string pastaj merre char e pare zakonisht
        char op = scan.next().charAt(0);
//Dallimi imetodes next() dhe nextLine() Naim Sulejmani

        if (op == '+')
            System.out.println(nr1 + nr2);
        else if (op == '-')
            System.out.println(nr1 - nr2);
        else if (op == '*')
            System.out.println(nr1 * nr2);
        else if (op == '/') {
            if (nr2 == 0)
                System.out.println("Can't devide by zero");
            else
                System.out.println(nr1 / nr2);
        } else if (op == '%')
            System.out.println(nr1 % nr2);
        else
            System.out.println("Invalid");

        // 12 * 25 = 300
    }
}
