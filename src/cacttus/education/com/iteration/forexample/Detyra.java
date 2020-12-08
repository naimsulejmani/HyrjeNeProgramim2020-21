package cacttus.education.com.iteration.forexample;

public class Detyra {
    public static void main(String[] args) {
        detyra2();
    }

    //Prej 1 deri ne 100 shtypi numrat me rend dhe katrorin e tyre
    public static void detyra1() {
        System.out.printf("n %20s %n", "n^2");
        for (int i = 1; i <= 10; i++) { // i - index, count, counter
            System.out.printf("%d %20d %n", i, i * i);
        }
    }


    //Prej 1 deri ne 100 shtypi numrat me rend dhe katrorin e tyre, kubin dhe rrenjen katror
    public static void detyra2() {
        System.out.printf("n %20s %20s %20s %n", "n^2", "n^3", "sqrt(n)");
        for (int i = 1; i <= 10; i++) { // i - index, count, counter
            System.out.printf("%d %20d %20.2f %20.2f  %n", i, i * i, Math.pow(i, 3), Math.sqrt(i));
        }
    }
}
