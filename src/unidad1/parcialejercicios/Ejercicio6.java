package unidad1.parcialejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la cantidad de paquetes: ");
        int paquetes = teclado.nextInt();
        int contadorRango1 = 0;
        int contadorRango2 = 0;
        int totalPesos = 0;

        for (int i = 0; i < paquetes; i++) {
            System.out.print("ingrese el peso del paquete " + (i + 1) + ": ");
            int peso = teclado.nextInt();
            totalPesos += peso;

            if (peso >= 1 && peso <= 20) {
                contadorRango1++;
            } else if (peso > 20) {
                contadorRango2++;
            }
        }

        System.out.println("paquetes con pesos 1kg - 20kg: " + contadorRango1);
        System.out.println("paquetes con pesos >20kg: " + contadorRango2);
        System.out.println("total de pesos: " + totalPesos);
        teclado.close();
    }

}
