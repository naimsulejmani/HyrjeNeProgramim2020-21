package cacttus.education.com.arrays;

public class InitArray {
    public static void main(String[] args) {


        enGashiArray();
    }

    public static void initArraySlide() {
        //int[] array = new int[10];
        int[] array = {1, 2, 3, 98, -23, -99, 124, 634, 5324, 123, 123};
        System.out.printf("%s%8s%n", "Index", "Value");

        array[10] = -77;

        //kush pe spjegon
        array[4 - 1] = array[10] + array[9]; //56

        for (int index = 0; index < array.length; index++)
            System.out.printf("%5d%8d%n", index, array[index]);
    }

    public static void enGashiArray() {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}
