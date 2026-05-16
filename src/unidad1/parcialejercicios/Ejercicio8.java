package unidad1.parcialejercicios;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la cantidad de clientes: ");
        int clientes = teclado.nextInt();
        int[] gastos = new int[clientes];
        int contadorRango1 = 0;
        int contadorRango2 = 0;
        int totalGastos = 0;

        for (int i = 0; i < clientes; i++) {
            System.out.print("ingrese el gasto del cliente " + (i + 1) + ": ");
            gastos[i] = teclado.nextInt();
        }

        for (int i = 0; i < clientes; i++) {
            totalGastos += gastos[i];
            if (gastos[i] >= 20000 && gastos[i] <= 100000) {
                contadorRango1++;
            } else if (gastos[i] > 100000) {
                contadorRango2++;
            }
        }

        System.out.println("Clientes con gastos entre $20.000 y $100.000: " + contadorRango1);
        System.out.println("Clientes con gastos mayores a $100.000: " + contadorRango2);
        System.out.println("Total de dinero recibido: " + totalGastos);
        teclado.close();
    }
}
