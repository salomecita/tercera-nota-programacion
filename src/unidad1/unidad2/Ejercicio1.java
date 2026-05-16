package unidad1.unidad2;

//Realizar un programa que solicite la carga por teclado de dos números,
//si el primero es mayor al segundo informar su suma y diferencia,
//en caso contrario informar el producto y la división
//del primero respecto al segundo.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1, numero2;

        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            double suma = numero1 + numero2;
            double diferencia = numero1 - numero2;

            System.out.println("La suma es: " + suma);
            System.out.println("La diferencia es: " + diferencia);
        } else {
            double producto = numero1 * numero2;

            System.out.println("El producto es: " + producto);

            if (numero2 != 0) {
                double division = numero1 / numero2;
                System.out.println("La division es: " + division);
            } else {
                System.out.println("No se puede dividir entre cero");
            }
        }
    }
}