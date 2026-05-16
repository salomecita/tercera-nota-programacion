package unidad1.unidad2;
import java.util.Scanner;
//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
//mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos
//un número entero)

public class Ejercicio3 {
    public static void main(string [] args) {

        scanner scanner = new scaner (sytemn.in);
        int numero;
        sytmen.out.print("ingrese un numero positivo de uno o dos digitos:");
        numero=scaner.netint();
        if (numero>0 && numero<10) {
            sytem.out.print("el numero tiene un digitos");
        } else {
            sytem.out.print("el numero tiene dos digitos");
        }

    }
}
