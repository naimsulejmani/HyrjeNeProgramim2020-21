package cacttus.education.com.detyraProvimi;

public class Main {


    public static void main(String[] args) {
      //  detyra2a();

       // detyra2b_advance(new int[]{1, 2, 3}, 10, 10);

       // test(1);

       // double[] c = new double[100];
        //duke supozuar se vargu c eshte i plotesuar me numra :)
       // System.out.println(detyra2c(c));
        //System.out.println(test(10));

        //pse njeren metode po mundem me thirre brenda println dhe tjetren jo
        //metoda detyra2c cfare vlere nga kthen per kete varg c

        detyra5();
        System.out.println(isIntegerPalindrome(10012));
    }


    static void detyra2a() {
        int[] f = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        System.out.println(f[5]);
    }

    //mirlinda
    static void detyra2b() {
        int[] g = new int[8];
        g[0] = 8;
        g[1] = 8;
        g[2] = 8;
        g[3] = 8;
        g[4] = 8;
    }

    //resuli
    static void detyra2b1() {
        int[] g = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 5; i++) {
            g[i] = 8;
        }
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i]);
        }
    }

    //qysh e kishe krijuar nje metode e cila pranon nje varg,
    // e validon ate, tregon sa elemente do te behen update nga fillimi
    // dhe vendose vleren qe e kemi dhene si parameter
    static void detyra2b_advance(int[] g, int howManyFirstElements, int number) {
        if (g.length < howManyFirstElements) {
            System.out.println("Nuk keni aq elemente ne varg per ti mbishkruar!!!");
            return;
        }
        for (int i = 0; i < howManyFirstElements; i++) {
            g[i] = number;
        }
    }

    //double[] c
    static double detyra2c(double c[]) {
        double sum = 0;
        for (int i = 0; i < c.length; ) {
            sum += c[i];
        }
        return sum;
    }

    static void test(int i) {
        System.out.println(i);
    }

    //resuli
    private static void detyra2d() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] b = {324, 6, 65, 34, 5, 7, 2, 24, 7, 9, 0, 312, 5, 532, 4, 6, 7, 424, 6, 23, 5, 67, 2, 5, 7, 8, 23, 4, 7, 97, 43, 1, 7};
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
    }

    //viktori printNumbers
    static void detyra5() {
        for (int i = 0; i < 9; i++) {
            int j = 9 - i;

            for (int k = 0; k < i; k++) {
                System.out.print("_");
            }
            for (int k = 0; k < j; k++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static int numberOfDigits(int n){
        int counter = 0;
        int a = n;
        while(a != 0){
            a /= 10;
            counter++;
        }
        return counter;
    }

    static boolean isIntegerPalindrome(int n) {
        int numOfDig = numberOfDigits(n);
        int a = n;
        int[] arr = new int[numOfDig];
        for(int i = 0; i < numOfDig; i++){
            arr[i] = a % 10;
            a /= 10;
        }
        for(int i = 0; i < numOfDig/2; i++){
            if(arr[i] != arr[numOfDig - 1 - i])
                return false;
        }
        return true;
    }
}
