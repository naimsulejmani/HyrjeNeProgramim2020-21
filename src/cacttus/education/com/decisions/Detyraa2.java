package cacttus.education.com.decisions;

import java.util.Scanner;

public class Detyraa2 {
    public static void main(String[] args) {
        //d2ResulSelmani();
        d2EnsarHoxha();
    }

    public static void d2ResulSelmani() {
        Scanner vlera = new Scanner(System.in);
        System.out.println("Shkruaj pagen");
        int paga = vlera.nextInt();
        if (paga < 0) {
            System.out.println("Koke n borxh o dostttt");
        } else if (paga > 0 && paga <= 80) {
            System.out.println("Koke me social");
        } else if (paga > 80 && paga <= 120) {
            System.out.println("Koke me social + pension");
        } else if (paga > 120 && paga <= 180) {
            System.out.println("Paske page minimale");
        } else if (paga > 180 && paga <= 300) {
            System.out.println("E paske ni page mesatare, si paske keq punt");
        } else if (paga > 300 && paga <= 400) {
            System.out.println("So keq jo, page t mire paske");
        } else if (paga > 400 && paga <= 600) {
            System.out.println("Pagen mbi mesetare e paske, ski pse ankohesh");
        } else if (paga > 600) {
            System.out.println("Mashallah ti i paske renet, kurgjo spot vyjka Europa");
        }
    }

    public static void d2EnsarHoxha() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa eshte rroga jote : ");
        int rroga = reader.nextInt();
        if (rroga < 0) {
            System.out.println("Ti je ne borgj");
        } else if (rroga == 0) {
            System.out.println("Ti je pa rroge");
        } else if (rroga > 1 && rroga <= 80) {
            System.out.println("Ti je ne social");
        } else if (rroga > 81 && rroga <= 120) {
            System.out.println("Ti je social+pensioner");
        } else if (rroga > 121 && rroga <= 180) {
            System.out.println("Ti ki page minimale");
        } else if (rroga > 181 && rroga <= 300) {
            System.out.println("Page mesatare");
        } else if (rroga > 301 && rroga <= 400) {
            System.out.println("Page e mire");
        } else if (rroga > 401 && rroga <= 600) {
            System.out.println("Page mbi mesataren");
        } else if (rroga > 601) {
            System.out.println("Page e larte ski qka e lshon kosoven");
        }

    }

    public static void d2ViktorAhmeti() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Se e ki rrogen: ");
        int paga = scan.nextInt();

        if (paga < 0)
            System.out.println("Borxh deri n'fyt");
        else if (paga <= 80)
            System.out.println("Social");
        else if (paga <= 120)
            System.out.println("Ja social ja pensioner");
        else if (paga <= 180)
            System.out.println("Page minimale");
        else if (paga <= 300)
            System.out.println("Page mesatare");
        else if (paga <= 400)
            System.out.println("Page e mire");
        else if (paga <= 600)
            System.out.println("Page mbi mesatare");
        else
            System.out.println("Mos u anko");
    }
}
