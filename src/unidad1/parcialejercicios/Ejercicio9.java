package unidad1.parcialejercicios;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la cantidad de vehiculos: ");
        int vehiculos = teclado.nextInt();
        int[] kilometros = new int[vehiculos];
        int contadorRango1 = 0;
        int contadorRango2 = 0;
        int totalKilometros = 0;

        for (int i = 0; i < vehiculos; i++) {
            System.out.print("ingrese los kilometros recorridos por el vehiculo " + (i + 1) + ": ");
            kilometros[i] = teclado.nextInt();
        }

        for (int i = 0; i < vehiculos; i++) {
            totalKilometros += kilometros[i];
            if (kilometros[i] >= 10 && kilometros[i] <= 300) {
                contadorRango1++;
            } else if (kilometros[i] > 300) {
                contadorRango2++;
            }
        }

        System.out.println("vehiculos con kilometros entre 10 y 300: " + contadorRango1);
        System.out.println("vehiculos con kilometros mayor a 300: " + contadorRango2);
        System.out.println("total de kilometros recorridos: " + totalKilometros);
        teclado.close();
    }
}
