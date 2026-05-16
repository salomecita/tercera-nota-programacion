package unidad1.parcialejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la cantidad de vendedores: ");
        int vendedores = teclado.nextInt();
        int[] ventas = new int[vendedores];

        int contadorrango1 = 0;
        int contadorrango2 = 0;
        int contadorrango3 = 0;
        int totalVentas = 0;

        for (int i = 0; i < vendedores; i++) {
            System.out.print("ingrese la cantidad de ventas del vendedor " + (i + 1) + ": ");
            ventas[i] = teclado.nextInt();
        }

        for (int i = 0; i < vendedores; i++) {
            totalVentas += ventas[i];
            if (ventas[i] > 0 && ventas[i] <= 100) {
                contadorrango1++;
            } else if (ventas[i] > 100 && ventas[i] <= 200) {
                contadorrango2++;
            } else if (ventas[i] > 200) {
                contadorrango3++;
            }
        }

        System.out.println("Vendedores con ventas 1-100: " + contadorrango1);
        System.out.println("Vendedores con ventas 101-200: " + contadorrango2);
        System.out.println("Vendedores con ventas >200: " + contadorrango3);
        System.out.println("Total de ventas: " + totalVentas);
        teclado.close();
    }

}
