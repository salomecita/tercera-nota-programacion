package unidad1.parcial;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el valor total de la compra: ");
        
        if (!sc.hasNextDouble()) {
            System.out.println("\nError: Debe ingresar un valor numérico válido.");
            return;
        }

        double valorCompra = sc.nextDouble();

        if (valorCompra < 0) {
            System.out.println("\nError: El valor ingresado es inválido.");
            return;
        }

        int descuentoPct;
        if (valorCompra < 50000) {
            descuentoPct = 0;
        } else if (valorCompra < 100000) {
            descuentoPct = 5;
        } else if (valorCompra < 200000) {
            descuentoPct = 10;
        } else {
            descuentoPct = 15;
        }

        double valorDescuento = valorCompra * descuentoPct / 100;
        double valorFinal = valorCompra - valorDescuento;

        System.out.println("\n----- RESUMEN DE COMPRA -----");
        System.out.println("Cliente: " + nombre);
        System.out.println("Valor original: $" + String.format("%,.0f", valorCompra));
        System.out.println("Descuento aplicado: " + descuentoPct + "%");
        System.out.println("Valor descontado: $" + String.format("%,.0f", valorDescuento));
        System.out.println("Valor final a pagar: $" + String.format("%,.0f", valorFinal));
        System.out.println("-----------------------------");

        sc.close();
    }
}