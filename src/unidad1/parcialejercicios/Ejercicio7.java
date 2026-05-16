package unidad1.parcialejercicios;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la cantidad de operarios: ");
        int operarios = teclado.nextInt();
        int[] produccion = new int[operarios];
        int contadorRango1 = 0;
        int contadorRango2 = 0;
        int totalProduccion = 0;

        for (int i = 0; i < operarios; i++) {
            System.out.print("ingrese la produccion del operario " + (i + 1) + ": ");
            produccion[i] = teclado.nextInt();
        }

        for (int i = 0; i < operarios; i++) {
            totalProduccion += produccion[i];
            if (produccion[i] >= 10 && produccion[i] <= 100) {
                contadorRango1++;
            } else if (produccion[i] > 100) {
                contadorRango2++;
            }
        }

        System.out.println("Operarios con produccion entre 10 y 100: " + contadorRango1);
        System.out.println("Operarios con produccion mayor a 100: " + contadorRango2);
        System.out.println("Produccion total de la fabrica: " + totalProduccion);
        teclado.close();
    }
}
