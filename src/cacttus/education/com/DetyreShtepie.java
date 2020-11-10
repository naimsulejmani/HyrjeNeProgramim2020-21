package cacttus.education.com;

import java.util.Scanner;

public class DetyreShtepie {
    public static void main(String[] args) {
        System.out.println("Ligji njutonit");
        ligjiDyteINjutonit();

        System.out.println("Ligji gravitetit");
        ligjiGravitetit();
    }

    public static void ligjiDyteINjutonit() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj masen e trupit: ");
        double masa = reader.nextDouble();

        System.out.println("Shkruaj nxitimin e trupit: ");
        double nxitimi = reader.nextDouble();

        double forca = masa * nxitimi; // F = m * a;

        System.out.printf("Forca eshte e barabarte: %.2f N",forca);

    }

    public static void ligjiGravitetit() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj masen e trupit: ");
        double masa = reader.nextDouble();

        System.out.println("Shkruaj gravitetin: ");
        double graviteti = reader.nextDouble();

        double forca = masa * graviteti; // F = m * a;

        System.out.printf("Forca eshte e barabarte: %.2f N",forca);
    }

    public static void syprinaKatrorit() {

    }

    public static void syprinaDrejtekendeshit() {
        
    }
}
