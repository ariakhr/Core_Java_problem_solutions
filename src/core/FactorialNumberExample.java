package core;

public class FactorialNumberExample {

    public static void main(String args[]) {
        int num = 5;
        System.out.println("Factorial number of " + num + " : " + factorial(num));
        System.out.println("Factorial number of " + num + " using loop : " + factorialNormal(num));

    }

    private static int factorial(int num) {
        if(num == 1) {
            return 1;
        } else {
            return (num*factorial(num-1));
        }
    }

    private static int factorialNormal(int num) {
        int fact = num;
        while(num > 1) {
            fact = fact * (num-1);
            num--;
        }
        return fact;
    }

}
