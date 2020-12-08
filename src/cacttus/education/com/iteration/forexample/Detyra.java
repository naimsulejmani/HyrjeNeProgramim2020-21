package cacttus.education.com.iteration.forexample;

public class Detyra {
    public static void main(String[] args) {
        detyra1();
    }
    //Prej 1 deri ne 100 shtypi numrat me rend dhe katrorin e tyre
    public static void detyra1() {
        System.out.printf("n %20s %n","n^2");
        for (int i = 1; i <= 10; i++) { // i - index, count, counter
            System.out.printf("%d %20d %n", i, i * i);
        }
    }
}
