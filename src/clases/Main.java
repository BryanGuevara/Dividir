package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        Dividir dividir = new Dividir();

        double resultado = dividir.dividirNumeros(numero1, numero2);

        System.out.println("El resultado de la división es: " + resultado);

        scanner.close();
    }
    
}
