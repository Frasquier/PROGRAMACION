public class ejercicio30 {
    public static void main(String[] args) {
        

        //creamos las variables.

        String nombretitular = "jose frasquier";
        long numerotarjeta = 30000482917L;
        char tipoletra = 'g';
        int saldocentimos = 1000;
        int viajesrealizados = 0;

        //constantes.

        final int preciocentimos = 140;

        //mostramos por consola.

        System.out.println(nombretitular);
        System.out.println("Numero tarjeta: " + numerotarjeta);
        System.out.println("Letra: " + tipoletra);
        System.out.println("Saldo: " + saldocentimos + " centimos.");
        System.out.println("Viajes realizados: " + viajesrealizados);

        //Viajes, ingresos.

        viajesrealizados ++ ;
        saldocentimos -= preciocentimos;
        viajesrealizados ++ ;
        saldocentimos -= preciocentimos;
        viajesrealizados ++ ;
        saldocentimos -= preciocentimos;
        int ingreso = 5;
        saldocentimos += (ingreso * 60);



        //volvemos a mostrar por consola.

        
        System.out.println(nombretitular);
        System.out.println("Numero tarjeta: " + numerotarjeta);
        System.out.println("Letra: " + tipoletra);
        System.out.println("Saldo: " + saldocentimos + " centimos.");
        System.out.println("Viajes realizados: " + viajesrealizados);
    }
}
