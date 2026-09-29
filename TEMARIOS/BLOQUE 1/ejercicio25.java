public class ejercicio25 {
    public static void main(String[] args) {
        
        
        //Creamos las variables.
        String NombreRestaurante = "Casa Pepe";
        int NumeroMesa = 7;
        String ImporteCuenta= "86.40";
        int NumeroComensales = 4;
        boolean TarjetaSoN = true;
        
        //constante 5% extra por pagar con tarjeta.
        
    final double SobrepagoConTarjeta = 0.05;

    //convertimos el importe a int.

    double importeINT = Double.parseDouble(ImporteCuenta);

    //Hacemos las cuentas.
    double ImporteMas = (importeINT * SobrepagoConTarjeta) + importeINT;
    double Dividida = ImporteMas / NumeroComensales;
    int DivididaEntera = (int) Dividida;
    int Centimos = (int)((Dividida - DivididaEntera)*100);
    


    
    


    System.out.println("Nombre restaurante: " + NombreRestaurante);
    System.out.println("Numero de mesa: " + NumeroMesa);
    System.out.println("Pago con tarjeta: " + TarjetaSoN);
    System.out.println("Pago en efectivo " + importeINT);
    System.out.println(Centimos);
   



    



    //hacemos las cuentas





    }
}
