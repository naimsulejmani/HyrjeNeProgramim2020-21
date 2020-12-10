package cacttus.education.com.iteration.forexample;

import java.util.Scanner;

public class DetyraNestedFor {
    public static void main(String[] args) {
        //detyra1VA();
       // detyra1Profa();
        //detyra2VA();
        detyra2RS();
    }

    public static void detyra1Profa() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int nr = reader.nextInt();

        for (int rreshti = 0; rreshti < nr; rreshti++) { //i=1; i<=5
            for (int kolona = 0; kolona < nr - rreshti; kolona++) {
                System.out.print("* ");
            }
            ;
            //masi te plotesohet njera kolone me informate dil ne kryesresht
            System.out.println();
        }
    }

    public static void detyra1VA() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void detyra2VA() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Shkruaj numrin: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { // j = i; j>0; j--
                System.out.print("&");
            }
            System.out.println();
        }
    }

    public static  void detyra2RS() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin: ");
        int nr = reader.nextInt();
        for(int i = 1; i <= nr; i++){
            for(int j = 0; j < i; j++){
                System.out.print("&");
            }
            System.out.println();
        }
    }


}
