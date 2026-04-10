package UnidadEjercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar los tres números
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        // Comparación con operador lógico
        boolean resultado = (num1 > num2) && (num1 < num3);

        // Mostrar resultado
        System.out.println("¿El primero es mayor que el segundo y menor que el tercero? " + resultado);

        sc.close();
    }
}