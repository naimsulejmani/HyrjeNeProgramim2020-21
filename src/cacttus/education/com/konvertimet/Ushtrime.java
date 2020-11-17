package cacttus.education.com.konvertimet;

public class Ushtrime {
    public static void main(String[] args) {
        String s1 = "25";
        byte b = Byte.parseByte(s1);

        String s2 = "254566";
        int i = Integer.parseInt(s2);
        String s3 = "12122334455";
        long l = Long.parseLong(s3);
        String s4 = "34.56";
        double d = Double.parseDouble(s4);
        String s5 = "true";
        boolean bool = Boolean.parseBoolean(s5);

        generateRandomInt(100);

        double vleraRandome = Math.random();
        int vleraParaprake = (int) (vleraRandome*901);
        // nese deshirojme numrat prej 0 deri ne 9 -> Math.random() * 10 -> 0.0 deri 9.9999999
        // nese deshirojme me gjeneru nje numer prej 0 deri 500 -> Math.random() * 501
        //gjenero numer prej 100 deri ne 1000 / 900 -> 0.0 deri 900.999999
        int vlera = 100 + vleraParaprake;
        System.out.println("Vlera prej 100 deri me 1000: "+vlera);
    }


    /*
        Ne vend te argumentit String[] args me perdore argument int
     */

    public static void generateRandomInt(int maxValue) {
        double rnd = Math.random();
        int vlera = (int) (rnd * maxValue);
        int vlera1 = (int) rnd * maxValue;//always 0
        System.out.println("Vlera = " + vlera);
        System.out.println("Vlera1 = " + vlera1);
    }

}
