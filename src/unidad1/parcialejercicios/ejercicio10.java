package unidad1.parcialejercicios;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese el numero de vehiculos: ");
        int vehiculos = teclado.nextInt();
        int[] pagos = new int[vehiculos];
        int contadorRango1 = 0;
        int contadorRango2 = 0;
        int totalPagos = 0;

        for (int i = 0; i < vehiculos; i++) {
            System.out.print("ingrese el pago del vehiculo " + (i + 1) + ": ");
            pagos[i] = teclado.nextInt();
        }

        for (int i = 0; i < vehiculos; i++) {
            totalPagos += pagos[i];
            if (pagos[i] >= 2000 && pagos[i] <= 20000) {
                contadorRango1++;
            } else if (pagos[i] > 20000) {
                contadorRango2++;
            }
        }

        System.out.println("vehiculos que pagaron entre $2.000 y $20.000: " + contadorRango1);
        System.out.println("vehiculos que pagaron mas de $20.000: " + contadorRango2);
        System.out.println("total recaudado por el parqueadero: " + totalPagos);
        teclado.close();
    }
}
