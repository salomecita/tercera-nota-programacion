package unidad1.unidad2;
 import java.util.Scanner;

public class Ejercicioparcial2 {
   

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int personas = teclado.nextInt();

        int[] datos = new int[personas];

        int contadorRango1 = 0;
        int contadorRango2 = 0;
        int total = 0;

        for (int i = 0; i < personas; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + ": ");
            datos[i] = teclado.nextInt();
        }

        for (int i = 0; i < personas; i++) {
            total = total + datos[i];

            if (datos[i] >= 100 && datos[i] <= 300) {
                contadorRango1++;
            } else if (datos[i] > 300) {
                contadorRango2++;
            }
        }

        System.out.println("Cantidad en el primer rango: " + contadorRango1);
        System.out.println("Cantidad en el segundo rango: " + contadorRango2);
        System.out.println("Total: " + total);
    }
}
}
