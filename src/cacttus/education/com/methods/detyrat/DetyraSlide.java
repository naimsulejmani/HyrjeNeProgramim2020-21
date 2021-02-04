package cacttus.education.com.methods.detyrat;

import java.util.Scanner;

public class DetyraSlide {
    public static void main(String[] args) {
        System.out.println(numeroZanoret("Viktor Ahmeti"));
        String text = "Viktor Ahmeti";
        System.out.println(text.length() - numeroZanoret(text));

        System.out.println(middle("Kosovar"));
        System.out.println(middleString("Naim Sulejmani"));

        System.out.println(vleraEInvestimit(2000, 0.10, 3));
        printCharFromTo('a', 'e');

        System.out.println(isValidPassword("HelloWorld"));
        System.out.println(isValidPassword("123NaimSulejmani"));
        /*

            ch !='A' && ch != 'E' ....
            ch='E'
            if !(ch=='A' || ch =='E')

         */
    }

    //me i numru te gjitha karakteret tjera perpos zanoreve


    //viktori detyra 1
    static int numeroZanoret(String s) {
        char ch;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            ch = s.toUpperCase().charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y')
                counter++;
        }
        return counter;
    }

    //viktori detyra 1
    static int numroPerveqZanoreve(String s) {
        char ch;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            ch = s.toUpperCase().charAt(i);
            if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y'))
                counter++;
        }
        return counter;
    }


    //ensar hoxha
    static void numroZanoretEH() {
        Scanner reader = new Scanner(System.in);
        String teksti = reader.nextLine();
        int zCount = 0;
        for (int i = 0; i < teksti.length(); i++) {
            if (teksti.charAt(i) == 'a' || teksti.charAt(i) == 'e' || teksti.charAt(i) == 'i' || teksti.charAt(i) == 'u' || teksti.charAt(i) == 'o' || teksti.charAt(i) == 'y') {
                zCount++;
            }
        }
        System.out.printf("Teksti i dhene ka %d", zCount);
    }


    //Ensar Hoxha
    public static String middle(String teksti) {
        int position;
        int length;
        if (teksti.length() % 2 == 0) {
            position = teksti.length() / 2 - 1;
            length = 2;
        } else {
            position = teksti.length() / 2;
            length = 1;
        }
        return teksti.substring(position, position + length);
    }

    //viktori
    static String middleString(String s) {//stringun e mesem
        return (s.length() < 3) ?
                null : (s.length() % 2 == 0) ?
                s.substring((s.length() - 1) / 2,
                        (s.length() + 1) / 2 + 1) : s.substring((s.length() - 1) / 2,
                (s.length() - 1) / 2 + 1);
    }

    //Viktori
    static int shumaShifrave(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    //rita
    static int shumaShifraveRB(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    //vleraEInvestimit
    static double vleraEInvestimit(double investimi, double interesi, int vitet) { //interesi mirret si double
        for (int i = 0; i < vitet; i++) {
            investimi += investimi * interesi;
        }
        return investimi;
    }

    static void printCharFromTo(char from, char to) {
        while (from <= to) {
            System.out.println(from++);
            //from++;
        }
    }

    //vitkroi
    /*

    e a -> a   e
     */
    static void detyra5(char a, char b) {//shtyp karakteret nga a ne b
        if (a > b) {//sigurohesh qe a <= b
            char t = a;
            a = b;
            b = a;
        }

        for (char i = a; i <= b; i++) {
            System.out.println(i + " ");
        }
    }


    static boolean isValidPassword(String tekst) {
        if (tekst.length() < 10) return false; // a  i ka teskti me pak se 10 karaktere
        //if(!(tekst.length()>=10)) return false; // a nuk i ka teksti 10 apo me shume karakterte

        for (int i = 0; i < tekst.length(); i++) {
            char ch = tekst.charAt(i);//

            if (!((ch >= 'A' && ch <= 'Z')
                    ||
                    (ch >= 'a' && ch <= 'z')
                    ||
                    (ch >= '0' && ch <= '9'))
            ) return false;
        }

        int countNumbers = 0;
        int countCapitalLetter = 0;
        int countLowerLetter = 0;
        for (int i = 0; i < tekst.length(); i++) {
            char ch = tekst.charAt(i);
            if (ch >= '0' && ch <= '9') countNumbers++;
            else
            if(ch>='A' && ch<='Z') countCapitalLetter++;
            else
            if(ch>='a' && ch<='z') countLowerLetter++;
        }

        if (countNumbers < 2) return false;
        if(countCapitalLetter<1) return false;
        if(countLowerLetter<1) return false;

        return true;
    }


    static boolean detyra6(String s){//validim i passwordit dy shifra njo tmadhe njo tvogel
        if(s.length() < 10)
            return false;
        else{
            int lowercase = 0;
            int uppercase = 0;
            int numbers = 0;
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch >= 'a' && ch <= 'z')
                    lowercase++;
                else if(ch >= 'A' && ch <= 'Z')
                    uppercase++;
                else if(ch >= '0' && ch <= '9')
                    numbers++;
            }

            return !(lowercase + uppercase + numbers < s.length() || numbers < 2 || lowercase < 1 || uppercase < 1);
        }
    }
}
