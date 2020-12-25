package cacttus.education.com.iteration.dowhileexmaple;

import java.util.Scanner;

public class DetyraEnsarHoxha {
    public static void main(String[] args) {
            detyra5();
    }

    public static void detyra4_Profa() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst :");
        String teksti = reader.nextLine();
        teksti = teksti.toLowerCase();
        String zanoret = "aeiuoy";
        String bashketingelloret = "qwrtpsdfghjklzxcvbnm";
        String shenjat = "!?.,'";
        int zanore = 0;
        int bashT = 0;
        int shenja = 0;
        int hapsir = 0;
        int tjeter = 0;
        int i = 0;

        do {
            char e = teksti.charAt(i);
            if (zanoret.contains(String.valueOf(e)))
                zanore++;
            else if (shenjat.contains(String.valueOf(e)))
                shenja++;
            else if (bashketingelloret.contains(String.valueOf(e)))
                bashT++;
            else if (e == ' ')
                hapsir++;
            else tjeter++;
            i++;
        } while (i < teksti.length());
        System.out.println("-----------------------------------");
        System.out.printf("Zanore:              %d %n", zanore);
        System.out.printf("Bashetingllore:      %d %n", bashT);
        System.out.printf("Shenja te pikesimit: %d %n", shenja);
        System.out.printf("Hapsira:             %d %n", hapsir);
        System.out.println("-----------------------------------");
    }


    public static void detyra4() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst :");
        String teksti = reader.nextLine();
        teksti = teksti.toLowerCase();
        int zanore = 0;
        int bashT = 0;
        int shenja = 0;
        int hapsir = 0;
        int tjeter = 0;
        int i = 0;



        do {
            char e = teksti.charAt(i);
            if (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u' || e == 'y')
                zanore++;
            else if (e == '!' || e == '?' || e == '.' || e == ',' || e == '"')
                shenja++;
            else if (e == 'b' || e == 'c' || e == 'd' || e == 'f' || e == 'g' || e == 'h' || e == 'j' || e == 'k' || e == 'l' || e == 'm' || e == 'n')
                bashT++;
            else if (e == 'v' || e == 'x' || e == 'z' || e == 's' || e == 'q' || e == 'w' || e == 'r' || e == 't' || e == 'p')
                bashT++;
            else if (e == ' ')
                hapsir++;
            else tjeter++;
            i++;
        } while (i < teksti.length());
        System.out.println("-----------------------------------");
        System.out.printf("Zanore:              %d %n", zanore);
        System.out.printf("Bashetingllore:      %d %n", bashT);
        System.out.printf("Shenja te pikesimit: %d %n", shenja);
        System.out.printf("Hapsira:             %d %n", hapsir);
        System.out.println("-----------------------------------");
    }

    public static void detyra5() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani nje tekst ne gjuhen shqipe: ");
        String teksti = reader.nextLine();
        int i, dh, gj, ll, nj, rr, sh, th, xh, zh;
        i = dh = gj = ll = nj = rr = sh = th = xh = zh = 0;
        do {

            //lexo dy karaktere 01 -> switch me i shiku se a eshte njera nga keto dh = gj = ll = nj = rr = sh = th = xh = zh
            // pastaj rrite indekin per 1 -> 12
            char ch = teksti.charAt(i);

            if (ch == 'd' && teksti.charAt(i + 1) == 'h')
                dh++;
            else if (ch == 'g' && teksti.charAt(i + 1) == 'j')
                gj++;
            else if (ch == 'l' && teksti.charAt(i + 1) == 'l')
                ll++;
            else if (ch == 'n' && teksti.charAt(i + 1) == 'j')
                nj++;
            else if (ch == 'r' && teksti.charAt(i + 1) == 'r')
                rr++;
            else if (ch == 's' && teksti.charAt(i + 1) == 'h')
                sh++;
            else if (ch == 't' && teksti.charAt(i + 1) == 'h')
                th++;
            else if (ch == 'x' && teksti.charAt(i + 1) == 'h')
                xh++;
            else if (ch == 'z' && teksti.charAt(i + 1) == 'h')
                zh++;
            i++;

        } while (i < teksti.length() - 1);
        System.out.println("-----------");
        System.out.printf("Shkronja dh: %d %n", dh);
        System.out.printf("Shkronja gj: %d %n", gj);
        System.out.printf("Shkronja ll: %d %n", ll);
        System.out.printf("Shkronja nj: %d %n", nj);
        System.out.printf("Shkronja rr: %d %n", rr);
        System.out.printf("Shkronja sh: %d %n", sh);
        System.out.printf("Shkronja th: %d %n", th);
        System.out.printf("Shkronja xh: %d %n", xh);
        System.out.printf("Shkronja zh: %d %n", zh);
        System.out.println("-----------");
    }
}
