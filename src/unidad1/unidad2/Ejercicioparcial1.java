package unidad1.unidad2;

//
import java.util.Scanner;

public class Ejercicioparcial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();
        
        double[] sueldos = new double[n];
        
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": $");
            sueldos[i] = scanner.nextDouble();
        }
        
       
        int empleadosBajo = 0;      
        int empleadosAlto = 0;      
        double totalGasto = 0;
        
        for (double sueldo : sueldos) {
            if (sueldo >= 100 && sueldo <= 300) {
                empleadosBajo++;
            } else if (sueldo > 300) {
                empleadosAlto++;
            }
            totalGasto += sueldo;
        }
        
        
        System.out.println("\n--- Reporte de Sueldos ---");
        System.out.println("Empleados que cobran entre $100 y $300: " + empleadosBajo);
        System.out.println("Empleados que cobran más de $300: " + empleadosAlto);
        System.out.printf("Importe total de sueldos: $%.2f%n", totalGasto);
        
        scanner.close();
    }
}
