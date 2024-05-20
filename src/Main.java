public class Main {
    public static void main(String[] args) {
        CalcPayment calc = new CalcPayment();
        double per = 9.99; // Процентная ставка за год
        int P = 1000000; // Сумма кредита
        int n = 12; // Количество периодов (мес)
        double r = per / 12 / 100; // Процентная ставка за 1 период
        int A = calc.calculate(P, n, r);
        System.out.println(" Ежемесячный платёж составит " + A);

    }
}