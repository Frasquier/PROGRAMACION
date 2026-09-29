public class ejercicio29 {
    public static void main(String[] args) {
        
        //creamos las variables.

        String direccion = "jaen";
        long referencia = 90000418235L;
        char letra = 'c';
        boolean ascensor = true;
        double metroscuadrados = 78.5;
        int habitaciones = 3;
        

        //constantes.
        final String precio = "850";
         
        //ganacias inmobiliaria

        final int fianzaalentrar = Integer.parseInt(precio) * 2;
        final double comision = (Integer.parseInt(precio) * 12) * 0.10;
        final double total = Integer.parseInt(precio) + fianzaalentrar + comision;


        System.out.println("A pagar por el primer mes: " + precio + " euros.");
        System.out.println("2 meses de fianza que serian: " + fianzaalentrar + " euros.");
        System.out.println("Comision de la inmobiliaria: " + comision + " euros.");
        System.out.println("Total: " + total + " euros.");
    }
}
