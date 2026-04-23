package Calculadora;

public class Modelo {

    public double sumar(double N1, double N2) {
        return N1 + N2;
    }
    public double restar(double N1, double N2) {
        return N1 - N2;
    }
    public double multiplicar(double N1, double N2) {
        return N1 * N2;
    }
    public double dividir(double N1, double N2) {
        if (N2 == 0) {
            throw new ArithmeticException("No se puede dividir para 0");
        }
        return N1 / N2;
    }
}
