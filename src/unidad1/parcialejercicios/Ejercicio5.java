package unidad1.parcialejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la cantidad de apartamentos: ");
        int apartamentos = teclado.nextInt();
        int[] consumos = new int[apartamentos];
        int contadorRango1 = 0;
        int contadorRango2 = 0;
        int totalConsumo = 0;

        for (int i = 0; i < apartamentos; i++) {
            System.out.print("ingrese el consumo del apartamento " + (i + 1) + ": ");
            consumos[i] = teclado.nextInt();
        }

        for (int i = 0; i < apartamentos; i++) {
            totalConsumo += consumos[i];
            if (consumos[i] >= 1 && consumos[i] <= 50) {
                contadorRango1++;
            } else if (consumos[i] > 50) {
                contadorRango2++;
            }
        }

        System.out.println("apartamentos con consumo 1-50: " + contadorRango1);
        System.out.println("apartamentos con consumo mayor a 50: " + contadorRango2);
        System.out.println("consumo total de agua: " + totalConsumo);
        teclado.close();
    }
    
}
