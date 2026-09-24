// programa que pide el precio de un producto y le añade el IVA.

public class ejercicio13 {
    public static void main(String[] args) {
        
        String Producto = System.console().readLine("Que producto has comprado? ");
        double PrecioProducto = Double.parseDouble(System.console().readLine("Que precio tiene? "));

        final double IVA = 1.21;
        double PrecioMasiva = PrecioProducto * IVA;

        System.out.println("El producto llamado: " + Producto + ", tiene un precio con IVA de: " + PrecioMasiva);
    }

}
