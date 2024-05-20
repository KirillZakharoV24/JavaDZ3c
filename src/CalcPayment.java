public class CalcPayment {
    public int calculate(int P, int n, double r) {
        int A = (int) ((r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1) * P);
        return A;
    }
}