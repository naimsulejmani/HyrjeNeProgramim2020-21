package cacttus.education.com.StringExample;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = "Naim Sulejmani"; // literl string
        //name eshte objekt i klases String

        System.out.printf("Karakteri i 3-te i tekstit  \"%s\": %s ", name, name.charAt(2));
        System.out.printf("%nTeksti %s ka gjithsej %d karaktere", name, name.length());
        String formattedString = String.format("%nTeksti %s ka gjithsej %d karaktere", name, name.length());
        System.out.println(formattedString);
        int gjatesia = name.length();
        System.out.println(String.format("%nTeksti %s ka gjithsej %d karaktere", name, name.length()));
        String variablaX = name.substring(2);
        System.out.printf("%nParaqite tekstin %s nga karakteri i 3-te deri ne fund: %s", name, name.substring(2));
        System.out.printf("%nParaqite tekstin %s nga karakteri i 3-te deri ne te 7-tin: %s", name, name.substring(2, 6));

        System.out.printf("%nTeksit aim a gjendet ne tekstin %s: %b", name, name.contains("aim"));
        System.out.printf("%nTeksit naim a gjendet ne tekstin %s: %b", name, name.contains("naim"));

        String emri = "Mirlinde";
        String mbiemri = "Xhelili";
        String emriPlote = String.join(" ose ", emri, mbiemri, name, "xyz");

        System.out.println("\nEmri plote: " + emriPlote);

        String vlera = " ";
        System.out.println("A eshte emri i zbrazet (pa space karaktere): " + vlera.isEmpty());
        System.out.println("A eshte emri i zbrazet(me space karaktere): " + vlera.isBlank());

        System.out.println("Concat: " + emri.concat(mbiemri).concat("Filan").concat("pakufi"));
        System.out.println("concat simple: " + emri + mbiemri);

        String teksti = "Neswr do tw bwhet mw mirw!";
        System.out.println("Teksti pa replace: " + teksti);
        teksti = teksti.replace('w', 'ë');
        System.out.println("Teksti me replace: " + teksti);
        System.out.println(teksti.replace("më mirë", "më keq"));

        String vlerat = "1,2,3,100,50";
        String[] vleratArray = vlerat.split(",");
        System.out.println(vleratArray[0]);
        System.out.println(vleratArray[1]);
        System.out.println(vleratArray[2]);
        System.out.println(vleratArray[3]);
        System.out.println(vleratArray[4]);
//Naim Sulejmani
        System.out.printf("%nTe teksti %s shkronja i gjendet ne indeksin: %s", name, name.indexOf("i"));
        System.out.printf("%nTe teksti %s shkronja i e dyte gjendet ne indeksin: %s", name, name.indexOf("i", 3));

        System.out.printf("%nTeksti %s konverto ne shkronja te vogla: %s", name, name.toLowerCase());
        System.out.printf("%nTeksti %s konverto ne shkronja te medha: %s", name, name.toUpperCase());
        String x = "Naim";
        String y = "naim";
        System.out.println();
        System.out.println(x.toLowerCase().equals(y.toLowerCase()));
        System.out.println(x.equalsIgnoreCase(y));
        String textToTrim = "   O FFILAN     A JE MIRE       ";
        System.out.printf("Teksti \"%s\" eshte tani \"%s\"", textToTrim, textToTrim.trim());

        int vitiAktual = 2020;
        String strVitiAktual = String.valueOf(vitiAktual);
        String strVitiAktual1 = "" + vitiAktual;
        System.out.println(strVitiAktual);
        System.out.println(strVitiAktual1);
        System.out.println(strVitiAktual.repeat(3));
        System.out.println(name.endsWith("ni"));
        System.out.println(name.startsWith("Na"));
        // Naim == naim

//        switch (x.toLowerCase()) {
//            case "naim": break;
//            default: break;
//        }


    }
}

