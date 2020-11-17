package cacttus.education.com.konvertimet;

public class Main {
    public static void main(String[] args) {
//        float a = 1234.56f; // 32 bit vend memorie (4-byte)
//        double b = a; // 64 bit vend ne momorie (8-byte)
//        // int c = a;
//        System.out.println("A = " + a);
//        System.out.println("B = " + b);

        byte b;
        int i = 122;
        double d = 105.142;
        System.out.println("Konvertimi i llojit int ne byte: ");
        b = (byte)i;
        System.out.println("i = " + i);
        System.out.println("b = " + b);
        System.out.println("Konvertimi i llojit double ne int: ");
        i = (int)d; //cast operatori me int
        System.out.println("d = " + d);
        System.out.println("i = " + i);
        System.out.println("Konvertimi i llojit double ne byte");
        b = (byte)d; //cast operatori me byte
        System.out.println("d = " + d);
        System.out.println("b = " + b);

    }
}
