package unidad1.parcialejercicios;
//Edades en un evento. En un evento ingresan n personas.
//  Se debe almacenar en un arreglo la edad de cada persona. 
// Realizar un programa que informe:
//  - Cuántas personas tienen entre 18 y 30 años
// - Cuántas personas tienen más de 30 años.
// - La suma total de las edades ingresadas
 

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int personas = teclado.nextInt();

        int[] edades = new int[personas];

        int contadorrango1 = 0;
        int contadorrango2 = 0;
        int sumaEdades = 0;

        
        for (int i = 0; i < personas; i++) {

            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");

            edades[i] = teclado.nextInt();
        }

       
        for (int i = 0; i < personas; i++) {

            sumaEdades = sumaEdades + edades[i];

            if (edades[i] >= 18 && edades[i] <= 30) {

                contadorrango1++;

            } else if (edades[i] > 30) {

                contadorrango2++;
            }
        }

        System.out.println("Personas entre 18 y 30 años: " + contadorrango1);

        System.out.println("Personas mayores de 30 años: " + contadorrango2);

        System.out.println("Suma total de las edades: " + sumaEdades);
        teclado.close();
    }
}