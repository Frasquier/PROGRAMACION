/* 
ejercicio 9: pide al usuario un numero de horas y conviertelo a dias y horas.
Por ejemplo, si introduce 50 el programa responde que son 2 dias y 2 horas.*/


public class ejercicio9 {
    public static void main(String[] args) {

        int NumeroHoras = Integer.parseInt(System.console().readLine("Horas: "));

        // Ahora calculo los dias

        int NumeroDias = NumeroHoras / 24;

        // Ahora cualculo y muestro las horas restantes
         int RestoHoras = NumeroHoras % 24;



        System.out.println(NumeroDias + " dias");
        System.out.println(RestoHoras + " horas");
        


    }
}
