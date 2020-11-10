package cacttus.education.com;

import java.util.Scanner;

public class DetyraMeSport {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ekipi vendas: ");
        String ekipiVendas = reader.nextLine();

        System.out.print("Ekipi musafir: ");
        String ekipiMusafir = reader.nextLine();

        System.out.print("Numri i tifozeve: ");
        int nrTifoz = reader.nextInt();

        reader.nextLine(); // flush ose zbraze bufferin
        System.out.print("Fusha/Arena: ");
        String fusha = reader.nextLine();

        System.out.printf("Sa gola ka shenuar %s: ",ekipiVendas);
        int golaVendas = reader.nextInt();

        System.out.printf("Sa gola ka shenuar %s: ",ekipiMusafir);
        int golaMusafir = reader.nextInt();

        System.out.println("------------------------------------------");
        System.out.println("Rezultati perfundimtar: ");
        System.out.printf("%s - %s: %d - %d %n",ekipiVendas,ekipiMusafir,golaVendas,golaMusafir);
        System.out.printf("Arena %s me gjithsej %d spektatore prezent.%n",fusha,nrTifoz);
        System.out.println("------------------------------------------");
    }
}
