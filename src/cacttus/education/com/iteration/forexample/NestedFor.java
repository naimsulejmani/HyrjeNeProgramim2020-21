package cacttus.education.com.iteration.forexample;

public class NestedFor {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            //trupi i metodes for i jashtem
            for (int j = 1; j < 5; j++) {
                System.out.printf("%d - %d %n", i, j);
            }

        }

    }
}
