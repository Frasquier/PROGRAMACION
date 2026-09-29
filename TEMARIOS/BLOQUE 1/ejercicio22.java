public class ejercicio22 {
    public static void main(String[] args) {
        
        //preguntamos al usuario cuanto tiempo ha estado y guardamos la constante de precioXminuto
        int tiempo = Integer.parseInt(System.console().readLine("Cuantos minutos has estado aparcado? "));
        final double precioxminuto = 0.045;

        //hacemos la cuenta del tiempo que ha estado el usuario en el parking.
         int tiempo1 = tiempo / 60;
        int tiempo2 = tiempo % 60;

        //calculamos el precio que tiene que pagar.
        double precio = tiempo * precioxminuto;

        //mostramos por consola los datos.
        System.out.println("Has estado: " + tiempo1 + "H y " + tiempo2 + " minutos.");
        System.out.println("tienes que pagar: " + precio + "E");
    
    }
}
