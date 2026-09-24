public class ejercicio10 {
    public static void main(String[] args) {
        
// ejercicio 10: programa que calcula el perimetro y el area de un rectangulo despues de preguntar al usuario sus dos lados.


double ancho = Double.parseDouble(System.console().readLine("Dame el ancho: "));
double largo = Double.parseDouble(System.console().readLine("Dame el largo: "));



double Perimetro = (ancho + largo) * 2;
double Area = ancho * largo;




System.out.println("Perimetro de: " + Perimetro + " y Area de: " + Area);
    }
}
