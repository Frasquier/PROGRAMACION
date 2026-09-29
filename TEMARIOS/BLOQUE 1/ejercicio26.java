public class ejercicio26 {
    public static void main(String[] args) {
        

        /*Crea las variables de una corredora que ha terminado la carrera, eligiendo tú el tipo más adecuado para cada dato:

Nombre y apellidos
Dorsal (1482)
Letra de la categoría ('S' sénior, 'V' veterana)
Si está o no federada
Kilómetros recorridos (10,5)
Tiempo total en segundos (3150)
Tu programa debe mostrarle a la corredora sus datos de carrera, en concreto:

Datos: nombre de la corredora, dorsal, categoría y si está federada.
Tiempo total (en horas, minutos y segundos).
Tiempo medio por kilómetro (cuánto ha tardado en hacer cada km). */

//Creamos las variables.
String NombreYApellidos = "Sofia Frasquier";
int Dorsal = 1482;
char Categoria = 'S';
boolean Federada = true;
double KilometrosRecorridos = 10.5;
int TiempoTotalSegundos = 3150;

//Creamos constantes. 
final int horas = 60;
final int Minutos = 60;

//hacemos las cuentas.

int tiempominutos = TiempoTotalSegundos / Minutos;
int RestoMinutos = TiempoTotalSegundos % Minutos;
int tiempohoras = tiempominutos / horas;
int restohoras = tiempominutos % horas;

double segundosporkilometro = TiempoTotalSegundos / KilometrosRecorridos;




//mostramos datos por consola.

System.out.println(NombreYApellidos);
System.out.println(Dorsal);
System.out.println("Federada: " + Federada);
System.out.println("horas: " + tiempohoras);
System.out.println("minutos: " + restohoras);
System.out.println("Segundos: " + RestoMinutos);
System.out.println("tiempo medio por kilometro: " + segundosporkilometro + " segundos");



    }
}
