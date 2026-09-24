public class ejercicio7 {
    public static void main(String[] args) {
        

        //LA pregunta: System.console().tradLine() --- Solo admite responder textos (String)
        // La conversion texto-numero: Integer.parseInt() o Double.parseDoble() 
    
        // La variabel: int notaProgramacion --- aqui guardamos la respuesta

        double notaProgramacion = Double.parseDouble(System.console().readLine("Nota de programacion:"));
        double notaBasesdedatos = Double.parseDouble(System.console().readLine("Nota de bases de datos:"));
        double notaSonestibilidad = Double.parseDouble(System.console().readLine("Nota de sonestibilidad:"));
        double notaDesarrollo = Double.parseDouble(System.console().readLine("Nota de desarrollo:"));

        double NumeroAsignaturas = 4.0;
        double SumaNotas = (notaBasesdedatos + notaDesarrollo + notaSonestibilidad + notaProgramacion); 
        double NotaMedia = SumaNotas / NumeroAsignaturas;
    
        System.out.println("Nota de Programacion: " + notaProgramacion + ". " + "Nota de bases de datos: " + notaBasesdedatos + ". " + "Nota de sonestibilidad: " + notaSonestibilidad + ". " + "Nota de desarrollo: " + notaDesarrollo );

        
    }
}

