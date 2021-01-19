package cacttus.education.com.methods;

public class Main {
    public static void main(String[] args) {
        MyClass.myMethod(); //metoda i takon klases

        int vleraMax = max(500, 200); // variabla vleraMax e ka vleren se cka na kthen metoda max (100,200)
        double vlera = max(400.3, 200);
        System.out.println(vleraMax);

        System.out.println(max(100.5, 200.5));

        vlera = 100 + 300.5 + 10.12f;
        //a eshte ne rregull ky kod i meposhtem
        vlera = max(100, 200) + max(300.5, 300.5) * max(1.5, 2);

        System.out.println(vlera);
//        MultidimensionalArray.rsSlideMatrix();
//
//        MultidimensionalArray ma = new MultidimensionalArray();
//        MultidimensionalArray.rsSlideMatrix();

//        MyClass objektiMyClass = new MyClass();
//        objektiMyClass.myMethod();

    }


    // emrin e njejte
    // numrin e parametrave e kane te njejte
    // tipet  i kan te ndryshme


    public static int max(int x, int y) //ketu vendosen se cka ka me gjujt gabime/perjashtime (exceptions)
    {
        if (x > y) return x;
        else return y;
    }

    public static double max(double x, double y) {
        if (x > y) return x;
        else return y;
    }

    //dy metodat e kan emrin max
    // dy metodat i kan nga dy parametra
    // duy metoda i kan tipet te njejta
    // renditja e tipeve eshte e ndryshme

    public static double max(int x, double y) {
        if (x > y) return x;
        else return y;
    }

    public static double max(double x, int y) {
        if (x > y) return x;
        else return y;
    }
    //ne java lejohet me deklaru metoda me emer te njete mirepo me nenshkrim te ndryshem (jashta emrit)
    //method overloading -> mbingarkimi i metodave
}
