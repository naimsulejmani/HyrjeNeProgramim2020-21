package cacttus.education.com.methods.ushtrime2;

public class VargjetMethods {
    public static void main(String[] args) {
        ensarHoxhaDetyra2();
    }

    public static void ensarHoxhaDetyra2() {
        int[] power_of_two = new int[10];

        for (int i = 0; i < power_of_two.length; i++) {
            //power_of_two[i] = (int) Math.pow(2, i);

            //zgjidhne fuqine me nje loop perseritese
            //viktori
            power_of_two[i] = 1;
            for (int j = 0; j < i; j++) {
                power_of_two[i] *= 2;
            }
        }
        printArray(power_of_two);
    }

    public static void viktoriDetyra3() {
        char[] letter = new char[26];

        int i = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            letter[i++] = ch;
        }
    }

    public static void endritiVeseliD3() {
        char[] letter = new char[26];
        for (int i = 0; i < letter.length; i++){
            letter[i] = (char) (65 + i);
        }
        for (int i = 0; i < letter.length; i++){
            System.out.println(letter[i]);
        }
    }

    public static void printArray(int[] array) {

        for (int nr : array) {
            System.out.printf("%4d", nr);
        }
        System.out.println();
    }
}
