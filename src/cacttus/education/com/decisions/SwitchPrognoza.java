package cacttus.education.com.decisions;

import java.util.Scanner;

public class SwitchPrognoza {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Selekto zgjidhjen nga me poshte: ");
        System.out.println("---------------------------------");
        System.out.println("1 - Zgjidhjen e profes"); // Zgjidhja e Forces
        System.out.println("2 - Zgjidhjen e Art-it"); // Zgjidhja e gravitet
        System.out.println("3 - Zgjidhjen e Viktor-it"); // Energjise Kinetike
        System.out.println("4 - Zgjidhjen e Rion-it"); // Energjise potenciale
        System.out.println("5 - Tjeter - per mos me ba zgjidhje!!!!!");
        System.out.println("---------------------------------");
        int zgjidhja = reader.nextInt();
        switch (zgjidhja) {
            case 1:
                profaPrognoza();
                break;
            case 2:
                artElshaniPrognoza();
                break;
            case 3:
                viktorAhemtiPrognoza();
                break;
            case 4:
                rionHasolliPrognoza();
                break;
            default:
                System.out.println("Nuk jeni per zgjidhje te problemeve!!!");
                break;
        }
    }

    public static void profaPrognoza() {
        Scanner input = new Scanner(System.in);
        System.out.print("Zgjedh ekipin vendas: ");
        String ekipi1 = input.next();
        System.out.print("Zgjedh ekipin musafir: ");
        String ekipi2 = input.next();
        System.out.println("Shkruaj prognozen: '1, 0, 2'");
        int prognoza = input.nextInt();
        String fituesi = "";

        switch (prognoza) {
            case 1:
                fituesi = " fiton " + ekipi1;
                break;
            case 2:
                fituesi = " fiton " + ekipi2;
                break;
            case 0:
                fituesi = " perfundon me barazim!";
                break;
            default:
                System.out.println("Reali gjithmon fiton!!!");
                break;
        }

        System.out.printf("Prognoza ime per ndeshjen ndermjet %s vs %s eshte se %s", ekipi1, ekipi2, fituesi);
    }

    public static void rionHasolliPrognoza() {
        Scanner reader = new Scanner(System.in);
        System.out.println("---------------------------------");
        String ekipi1 = reader.nextLine();
        String ekipi2 = reader.nextLine();
        int prognozaa = reader.nextInt();

        switch (prognozaa) {

            case 1:
                System.out.println("prognoza ime eshte per " + ekipi1);
                break;

            case 0:
                System.out.println("barazim mesin");
                break;
            case 2:
                System.out.println("prognoza ime esjte per " + ekipi2);
                break;
            default:
                System.out.println("reali gjith fiton"); //:D
                break;
        }
    }

    public static void viktorAhemtiPrognoza() {
        Scanner scan = new Scanner(System.in);

        String vendas = scan.nextLine();
        String musafir = scan.nextLine();
        String prog = scan.nextLine();
        String mesazh = "Prognoza ime per ndeshjen ndermjet"
                + vendas + " dhe " + musafir + " eshte se ";
        switch (prog) {
            case "1":
                System.out.println(mesazh + vendas + " fiton");
                break;
            case "X":
                System.out.println(mesazh + "ekipet mbesin barazim");
                break;
            case "2":
                System.out.println(mesazh + musafir + " fiton");
                break;
        }
    }

    public static void ensarHoxhaPrognozaMeIf() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Cila eshte ekipi i pare :");
        String ekipi1 = reader.nextLine();
        System.out.println("Cila eshte ekipi i dyte :");
        String ekipi2 = reader.nextLine();
        System.out.println("Cila eshte prognoza juaj ;");
        int prognoza = reader.nextInt();
        if (prognoza == 1) {
            System.out.printf("%s fiton ", ekipi1);
        } else if (prognoza == 2) {
            System.out.printf("%s fiton", ekipi2);
        } else if (prognoza == 0) {
            System.out.printf("barazim");
        } else {
            System.out.println("keni gabuar");
        }
    }

    public static void artElshaniPrognozaMeIf() {
        Scanner input = new Scanner(System.in);
        System.out.print("Zgjedh ekipin vendas ");
        String ekipi1 = input.next();
        System.out.print("Zgjedh ekipin musafir ");
        String ekipi2 = input.next();
        System.out.println("Shkruaj prognozen: '1, X, 2");
        int prognoza = input.nextInt();
        if (prognoza == 0) {
            System.out.println("Barazim");
        } else if (prognoza == 1) {
            System.out.println("Ekipi vendas fiton");
        } else if (prognoza == 2) {
            System.out.println("Ekipi musafir fiton");
        } else {
            System.out.println("Shko n'lumi");
        }
    }

    public static void artElshaniPrognoza() {
        Scanner input = new Scanner(System.in);
        System.out.print("Zgjedh ekipin vendas ");
        String ekipi1 = input.next();
        System.out.print("Zgjedh ekipin musafir ");
        String ekipi2 = input.next();
        System.out.println("Shkruaj prognozen: '1, X, 2");
        int prognoza = input.nextInt();
        switch (prognoza) {
            // performs addition between numbers
            case 0:
                System.out.print("barazim mes ekipeve");
                break;
            case 1:
                System.out.print("Fiton ekipi  vendas");
                break;
            case 2:
                System.out.print("Fiton ekipi  musafir");
                break;
            default:
                System.out.println("shko n'lumi se si kemi ne");
                break;
        }
    }
}
