package cacttus.education.com.methods.recursion;

public class GFG {
    static void printFun(int test) {
        if (test < 1)
            return;
        else {
            System.out.printf("%d", test);
            printFun(test - 1);
            System.out.printf("%d", test);
            return;
        }
    }

    public static void main(String[] args) {
        int test = 3;
        printFun(test);
        System.out.println();
        numratDesc(10);
        System.out.println();
        numratAsc(10);
        System.out.println();
        collatz(100);

        System.out.println("\n\n\n");
        print(new int[] {100,890,123,5243,31});
    }

    //gjini
    static void numratDesc(int n) {
        if (n == 0) return;
        System.out.printf("%4d", n); // sthype njehere
        numratDesc(n - 1); // pastaj thirre numrin vijues
    }

    //gjini
    static void numratAsc(int n) {
        if (n == 0) return;

        numratAsc(n - 1); // thirri numrat vijues
        System.out.printf("%4d", n); // pastja fillo shtypi
    }

    static void collatz(int N) {
        System.out.printf("%4d", N);
        if (N == 1) return;//rasti terminues

        if (N % 2 == 1) collatz(N * 3 + 1);
        else collatz(N / 2);
    }
//viktori
    public static void print(int[] arr) {
        print(arr, arr.length);
    }

    private static void print(int[] arr, int n) {
        if (n < 1)
            return;

        print(arr, n - 1);
        System.out.printf("%10d",arr[arr.length - n]);
    }


    //te shkruhet metoda me recursion i cili ben printimin e elementeve ne varg
    // array, index
//resul
    static void printArray(int []data, int num){
        if(num != -1){
            printArray(data, num - 1);
            System.out.println(data[num]);
        }
    }
}