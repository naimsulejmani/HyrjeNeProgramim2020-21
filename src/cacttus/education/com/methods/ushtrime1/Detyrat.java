package cacttus.education.com.methods.ushtrime1;

public class Detyrat {
    static void printOk() {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        printOk();
        print("OK");
        print("Hello");
        zbritja(100, 200);

        double rez = deduction(8.98, 6.11);
        System.out.println(rez);
       // shtypAlfabetin();
       // System.out.println();
        //shtypAlfabetinEH();
        //shtypAlfabetinVA();


        shtypAlfabetin(false);

        System.out.println(prodhimi(10.5,20.1));
    }

    //viktori
    public static void print(String mesazhi) {
        System.out.println(mesazhi);
    }

    //viktori
    static void zbritja(double a, double b) {
        double rez = a - b;
        print(String.valueOf(rez));
        //	System.out.print(a-b);
    }

    //mirlinda
    static double deduction(double a, double b) {
        return a - b;
    }


    //mirlinda

    static void shtypAlfabetin() {
        for (char ch = 'A'; ch <= 'Z'; ch++)
            System.out.print(ch + " ");
    }

    //Ensari
    public static void shtypAlfabetinEH() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }

    //Viktori
    public static void shtypAlfabetinVA(){
        String alfabeti = "abdefghijklmnopqrstuvwxyz";

        for(int i = 0; i > alfabeti.length(); i++){
            System.out.print(alfabeti.charAt(i) + " ");
        }
    }

    //profa
    public static void shtypAlfabetinProfa(boolean printToLowerCase) {
        if(printToLowerCase) shtypAlfabetin();
        else shtypAlfabetinEH();
    }

 //   Viktori (10 she per detyre)
    public static void shtypAlfabetin(boolean printToLowercase){
        char ch = (printToLowercase) ? 'a' : 'A'; //operatori ternar
        char copy = ch;
        for(; ch < copy + 26; ch++){
            System.out.println(ch);
        }
    }


   // gjini

    static void shtypAlfabetinGjini(boolean madhsia){
        if (madhsia == true){
            for (char shkronja = 'A'; shkronja <= 'Z';shkronja++)
                System.out.println(shkronja);
        }else {
            for (char shkronja = 'a'; shkronja <= 'z';shkronja++)
                System.out.println(shkronja);
        }
    }
    //ENSARI

    public static void shtypAlfabetinEnsari(boolean a){
        if (a==true){
            for( char ch = 'a' ; ch <= 'z' ; ch++ ){
                System.out.println(ch);
            }
        }
        else{

            for( char ch = 'A' ; ch <= 'Z' ; ch++ ){
                System.out.println(ch);
            }
        }
    }

    //ensar gjini dhe mirlinda
    static double prodhimi(double a, double b){
        return a * b;
    }
}
