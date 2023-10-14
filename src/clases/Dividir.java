package clases;

public class Dividir {
    public double dividirNumeros(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
    }
}
