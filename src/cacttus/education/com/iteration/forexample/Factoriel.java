package cacttus.education.com.iteration.forexample;

import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //vlera ku kem me ruajt rezultatin
        int fact = 1; // duhet te jete e inicializuar me 1

        System.out.println("Shkruaj numrin per te gjetur vleren e faktorielit: ");
        int nr = reader.nextInt();

        if (nr >= 0) {
            //for -> incializimin; kushtin; iterimin (hapat rrites/zbrites)
            for (int counter = nr; counter >= 1; counter--) {
                //nese plotesohet kushti counter>=1 atehere ekzekutohet kjo pjese SCOPE i FOR-it
                fact = fact * counter; // fact *= counter; // compound operator
                //pasi kryhen shprehjet shko tek iterimi (hapat rrites / zbrites) counter--
            }

            System.out.printf("Factorili i numrit %d eshte %d%n", nr, fact);
        } else {
            System.out.println("Nuk ka faktorial per numrat negativ");
        }

    }


}
