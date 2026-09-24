public class Ejercio {
    public static void main(String[] args) {

        //1. Preguntamos por consola
        
        
        String nombre = System.console().readLine("como te llamas?");
        int edad = 19;

        //VARIABLES (sirve para guardar un dato)
        //Tipos:
        // - Un caracter: char
        // - Varios caracteres (palabras, frases, contraseñas...): String
        // - Un numero entero: int
        // - Un numero decimal: float o double

        //2. Imprimimos por consola
        System.out.println(nombre + " tiene " + edad + " años");
    }
}