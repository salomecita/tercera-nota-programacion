package unidad1.parcialejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclacor = new Scanner(System.in);
        System.out.print("ingrese la cantidad de estudiantes: ");
        int estudiantes = teclacor.nextInt();
        int[] notas = new int[estudiantes];
        int contadorrango1 = 0;
        int contadorrango2 = 0;
        int contadorrango3 = 0;
        int totalNotas = 0;

        for (int i = 0; i < estudiantes; i++) {
            System.out.print("ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = teclacor.nextInt();
        }

        for (int i = 0; i < estudiantes; i++) {
            totalNotas += notas[i];
            if (notas[i] > 0 && notas[i] <= 3) {
                contadorrango1++;
            } else if (notas[i] > 3 && notas[i] <= 5) {
                contadorrango2++;
            } else if (notas[i] > 5 && notas[i] <= 10) {
                contadorrango3++;
            }
        }

        System.out.println("estudiantes con notas 1-3: " + contadorrango1);
        System.out.println("estudiantes con notas 4-5: " + contadorrango2);
        System.out.println("estudiantes con notas 6-10: " + contadorrango3);
        System.out.println("total de notas: " + totalNotas);
        teclacor.close();
    }

}
