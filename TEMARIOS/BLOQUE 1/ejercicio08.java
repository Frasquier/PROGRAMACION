public class ejercicio08 {
    public static void main(String[] args) {

        int PrimerNumero = Integer.parseInt(System.console().readLine("Dame el primer numero "));
        int SegundoNumero = Integer.parseInt(System.console().readLine("Dame el segundo numero "));

        int Suma = PrimerNumero + SegundoNumero;
        int Resta = PrimerNumero - SegundoNumero;
        int Multiplicacion = PrimerNumero * SegundoNumero;
        double Division = PrimerNumero / SegundoNumero;

        System.err.println("Esta la suma de los numeros: " + Suma);
        System.err.println("Esta la resta de los numeros: " + Resta);
        System.err.println("Esta la multiplicacion de los numeros: " + Multiplicacion);
        System.err.println("Esta la division de los numeros: " + Division);

    }
}
