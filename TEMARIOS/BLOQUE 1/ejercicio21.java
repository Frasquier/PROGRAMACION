public class ejercicio21 {
    public static void main(String[] args) {

        //primero creo todas las variables

        String Nombre = "Jose";
        String Apellido = "Frasquier";
        long DNI = 20260000731L;
        char letra = 'A';
        boolean Multas = true;
        int libros = 3;
        int retrasos = 5;

        //constante

        final double preciomulta = 0.20;

        //calculo de la multa

        double multa = preciomulta * libros * retrasos;
    

        //despues le pido a la consola que me imprima
        
        System.out.println("Nombre: " + Nombre + " " + Apellido);
        System.out.println("Dni: " + DNI + letra);
        System.out.println("Multas: " + Multas);
        System.out.println("libros en posesion: " + libros);
        System.out.println("Dias de retraso: " + retrasos);
        System.out.println("Total multa: " + multa);




    }
}
