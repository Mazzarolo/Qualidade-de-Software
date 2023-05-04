public class Calculator {
    public double sum(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }
    
    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division (double a, double b) {
        return a / b;
    }

    public double pow(double base, int exp) {
        double res = 1;
        for (int i = 0; i < exp; i++) {
            res = multiplication(res, base);
        }
        return res;
    }

    public double sqrt(double num) {
        return Math.sqrt(num);
    }

    public int fatorial(int num) {
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat = (int) multiplication(fat, i);
        }
        return fat;
    }

    public double[] bhaskara(double a, double b, double c) {
        double delta = pow(b, 2) - multiplication(multiplication(4, a), c);
        double x1, x2;
    
        if (delta > 0) {
            x1 = division(sum(-b, sqrt(delta)), multiplication(2, a));
            x2 = division(subtraction(-b, sqrt(delta)), multiplication(2, a));
            return new double[] {x1, x2};
        } else if (delta == 0) {
            x1 = division(-b, multiplication(2, a));
            return new double[] {x1};
        } else {
            return new double[0];
        }
    }
}