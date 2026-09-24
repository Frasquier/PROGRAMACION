// conversor de euros a dolares. pide el importe al usuario y muestra el importe convertido


public class ejercicio11 {
    public static void main(String[] args) {

        //Los datos que pueden variar se guardan en variables.
        //Los datos que no van a variar se guarrdan en constantes.

        double Euros = Double.parseDouble(System.console().readLine("Dame la cantidad de euros que quieres convertir: "));
        final double Dolar = 1.15;
        double Dolares = Euros * Dolar;
    
    


        System.out.println("Son " + Dolares + " Dolares");
        
    }
}
