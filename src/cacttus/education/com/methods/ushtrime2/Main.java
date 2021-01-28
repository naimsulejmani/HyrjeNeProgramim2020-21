package cacttus.education.com.methods.ushtrime2;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        hello(x, y);
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        //google doc office 365 word online
        int[] vargu = {1, 10, 100};
        buy(vargu);
        tung(vargu[1]);

        for (int nr : vargu) {
            System.out.printf("%4d", nr);
        }

        String[] emrat = new String[]{
                "Naim", "Viktor", "Mirlinde", "Resul"
        };

        String shteti = "Shqiperia";
        helloString(shteti);
        System.out.println();
        System.out.println(shteti);

        buyString(emrat);

        for (String emri : emrat) {
            System.out.println(emri);
        }
    }

    public static void buyString(String[] array) {
//        array[0] = "Ensari";
        array = new String[]{
                "Sulejmani", "Filani", "Fistekja"
        };
    }

    //per arsye se stringu cdohere kur perdorim operatorin assignment (=) merr reference
    //te re  ose nje reference ekzituese nga String POOL ose krijohet nje reference e re
    public static void helloString(String str) {
        str = "Kosova";
    }

    // metodat ka parametra
    // 1. tipe primitive - shkon kopja e tyre (shkone vlera e tyre) (pass by value)
    // 2. tipe reference - shkon referenca e tyre pasi vlera e tyre eshte nje adrese memorike ne heap
    public static void hello(int x, int y) {
        x = x * 2;
        y = x * 2;
    }

    public static void buy(int[] array) {
        array[0] = -1;
    }

    public static void tung(int elementIVargut) {
        ++elementIVargut;
    }
}
