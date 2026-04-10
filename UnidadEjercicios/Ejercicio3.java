package UnidadEjercicios;

public class Ejercicio3 {
    public static void main(String[] args) {
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanas = 4;

        double retiroTotal = retiroSemanal * semanas;
        double saldoFinal = saldoInicial - retiroTotal;

        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Retiro total en el mes: $" + retiroTotal);
        System.out.println("Saldo final: $" + saldoFinal);
}
}
