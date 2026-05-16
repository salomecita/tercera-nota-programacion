package unidad1.unidad2;

import java.util.Scanner;

//Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
//mensaje en pantalla indicando que debe abonar impuestos.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el sueldo de la persona: ");
        double sueldo = scanner.nextDouble();
        
        if (sueldo > 3000) {
            System.out.println("Este sueldo supera los 3000 dólares. Debe abonar impuestos.");
        }
        
        scanner.close();
    }
}
