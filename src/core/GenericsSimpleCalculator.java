package core;

public class GenericsSimpleCalculator {

    public static void main(String args[]) {

        System.out.println(" Addition of Double : " + sum(100.5,2015.15));
        System.out.println(" Addition of int : " + sum(100,2015));
        System.out.println(" Addition of float : " + sum(118f, 1003f));
        System.out.println(" Addition of float + double : " + sum(118f, 107.15));

    }

    public  static <N extends Number> double sum(N x, N y) {
        double sum = 0;
        return x.doubleValue() + y.doubleValue();
    }
}
