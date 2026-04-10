package UnidadEjercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        double camiseta = 25.0;
        double pantalon = 30.0;
        double descuento = 0.15;
        double descuentoAdicional = 0.05;

        double camisetaDescuento = camiseta - (camiseta * descuento);
        double pantalonDescuento = pantalon - (pantalon * descuento);

        double totalAmbas = camisetaDescuento + pantalonDescuento;

        double segundaCamiseta = camisetaDescuento - (camisetaDescuento * descuentoAdicional);
        double totalConSegundaCamiseta = totalAmbas + segundaCamiseta;

        System.out.println("Precio camiseta con descuento: $" + camisetaDescuento);
        System.out.println("Precio pantalon con descuento: $" + pantalonDescuento);
        System.out.println("Total de ambas prendas: $" + totalAmbas);
        System.out.println("Precio segunda camiseta con descuento adicional: $" + segundaCamiseta);
        System.out.println("Total con segunda camiseta: $" + totalConSegundaCamiseta);
    
}
}
