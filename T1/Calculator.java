public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int multiplication(int a, int b) {
        return a * b;
    }

    public int pow(int base, int exp) {
        int res = 1;
        for (int i = 0; i < exp; i++) {
            res = multiplication(res, base);
        }
        return res;
    }
}