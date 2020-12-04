package cacttus.education.com.StringExample;

import java.util.Scanner;

public class DetyratMeString {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //detyraA();
        //detyraB();
        //detyraC();
        //detyraD();
        detyraE();
    }

    public static void detyraA() {
        System.out.println("Shkruj tekstin");
        String teksti = reader.nextLine();
        System.out.printf("%nTeksti %s ka gjithsej %d karaktere", teksti, teksti.length());
    }

    public static void detyraB() {
        System.out.println("Shkruj tekstin");
        String teksti = reader.nextLine();
        System.out.printf("%nTeksti %s ka gjithsej %d karaktere", teksti, teksti.length());
        System.out.printf(
                "%nShkruaj nje indeks nga 0 deri me %d per te paraqitur tekstin e dhene nga indeksi deri ne fund:",
                teksti.length() - 1);
        int index = reader.nextInt();
        //valido indeksin qe te jete brenda vlerave te lejuara nga fillimi deri ne indeksin e fundit
        if (index >= 0 && index < teksti.length()) {
            System.out.println(teksti.substring(index));
        } else {
            System.out.println("Indeki nuk eshte ne rangun e vlerave te lejuara!");
        }
    }

    public static void detyraC() {
        System.out.println("Shkruj tekstin");
        String teksti = reader.nextLine();
        System.out.printf("Shkruaj indeksin e fillimit nga 0 deri me %d: ", teksti.length() - 1);
        int startIndex = reader.nextInt();

        if (startIndex < 0 || startIndex >= teksti.length()) {
            System.out.println("Indeksi i fillimit nuk eshte brenda vlerave te lejuara!");
        } else {
            System.out.printf("Shkruaj indeksin e mbarimi nga %d deri me %d", startIndex, teksti.length() - 1);
            int endIndex = reader.nextInt();

            // tentoni me kthy me ternary operator ?:
//            if (endIndex < startIndex || endIndex >= teksti.length()) {
//                System.out.println("Indeksi i mbarimit nuk eshte brenda vlerave te lejuara!");
//            } else {
//                System.out.println(teksti.substring(startIndex, endIndex));
//            }

            System.out.println(
                    endIndex < startIndex || endIndex >= teksti.length() ?
                            "Indeksi i mbarimit nuk eshte brenda vlerave te lejuara!" :
                            teksti.substring(startIndex, endIndex)
            );

        }
    }

    public static void detyraD() {
        System.out.println("Shkruj tekstin");
        String teksti = reader.nextLine();
        System.out.println("Shkruani tekstin qe po kerkoni:");
        String searchText = reader.nextLine();

        //shiko per indeksin se ku fillon teksi i kerkuar ne tekstin e dhene
        int searchIndex = teksti.indexOf(searchText); // nese ka vlere >=0 atehere teksti gjendet brenda tekstit te dhene, perndryshe jo
        // int searchIndex1 = teksti.toLowerCase().indexOf(searchText.toLowerCase());
        // int searchIndex2 = teksti.toUpperCase().indexOf(searchText.toUpperCase());
        //kerkimi eshte case sensitive

        if (searchIndex >= 0) {
            System.out.printf("Teksi \"%s\" gjendet ne tekstin e dhene \"%s\".%nIndeksi i paraqitjes se pare fillon me: %d",
                    searchText, teksti, searchIndex);
        } else {
            System.out.printf("Teksi \"%s\" nuk gjendet ne tekstin e dhene \"%s\"", searchText, teksti);
        }
    }

    public static void detyraE() {
        System.out.println("Shkruj tekstin");
        String teksti = reader.nextLine();
        System.out.println("Shkruani tekstin qe po kerkoni te zavendesoni:");
        String searchText = reader.nextLine();
        System.out.println("Shkruani tekstin zevendesues: ");
        String replaceText = reader.nextLine();

        if (teksti.contains(searchText)) {
            System.out.println("Teksti i zevendesuar: " + teksti.replace(searchText, replaceText));
        } else {
            System.out.println("Fjala e kerkuar nuk gjendet ne tekstin e dhene, me cka nuk ka ndryshime!!!");
        }
    }


}
