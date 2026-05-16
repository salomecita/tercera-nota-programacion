package unidad1.parcialejercicios;
//Sueldos de empleados.En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500.
// Realizar un programa que almacene los sueldos en un arreglo e informe: 
// - Cuántos empleados cobran entre $100 y $300.
// - Cuántos empleados cobran más de $300.
// - El importe total que gasta la empresa en sueldos.

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la cantidad de empleados: ");

        int empleados = teclado.nextInt();
        int[] sueldos = new int[empleados];
        int contadorrango1=0;
        int contadorrango2=0;
        int totalSueldos=0;

        for (int i=0; i<empleados; i++){
            System.out.print("ingrese el sueldo del empleado " + (i+1) + ": ");
            sueldos[i] = teclado.nextInt();
        }
        
        for (int i=0; i<empleados; i++){
            totalSueldos = totalSueldos + sueldos[i];
            if (sueldos[i]>=100 && sueldos[i]<=300){
                contadorrango1++;
            }else if (sueldos[i]>300){
                contadorrango2++;
            }
        }
    
        System.out.println("Empleados que cobran entre $100 y $300: " + contadorrango1);
        System.out.println("Empleados que cobran más de $300: " + contadorrango2);
        System.out.println("Total gastado en sueldos: $" + totalSueldos);
        teclado.close();
    }
}
