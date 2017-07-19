
interface Computable {

    double operation(double a, double b);

}

public class Main {

    public static void main(String[] args) {

        new Main().test();

    }

    private double compute(double a, double b, Computable c) {
        return c.operation(a, b);
    }

    void test() {

//        double r = compute(10, 40, (a, b)-> a + b);
//        double r = compute(10, 20, new Computable() {
//            @Override
//            public double operation(double a, double b) {
//                return a + b;
//            }
//        });
        class Addable implements Computable {

            @Override
            public double operation(double m, double n) {
                return m + n;
            }
            
        }

        double r = compute(10, 20, new Addable());
        System.out.println(r);

    }

}

