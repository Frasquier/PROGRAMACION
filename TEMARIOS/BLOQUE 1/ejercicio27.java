public class ejercicio27 {
    public static void main(String[] args) {
        
//creamos las variables.

String codigodevuelo = "IB3172";
String destino = "Madrid";
char LetraPuerta = 'B';
boolean internacional = true;
int duracion = 155;
int pasajeros = 186;

//constante.

final double preciobillete = 89.99;
final int totalpasajeros = 189;
final int minutos = 60;

//calculos.
int duracionhoras = duracion / minutos; 
int restohoras = duracion % minutos;
int asientoslibres = totalpasajeros - pasajeros;

double ocupacion = (pasajeros * 100) / totalpasajeros;

double recaudacion = pasajeros * preciobillete;



System.out.println("Duracion del vuelo: " + duracionhoras + " horas y " + restohoras + " minutos");
System.out.println("Porcentaje ocupacion: " + ocupacion + "%");
System.out.println("Quedan: " + asientoslibres + " asientos libres");
System.out.println("Hemos recaudado un total de: " + recaudacion + "euros.");
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println();






    }
}
