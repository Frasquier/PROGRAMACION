public class ejercicio23 {
    public static void main(String[] args) {
        
     //creo las variables.
    String NombreGranja = "Hermanos Frasquier.SL";
    float NumeroSanitario = 41012345678L;
    char TallaHuevos = 'M';
    boolean Ecologicos = true;
    int HuevosRecogidos = 20;

    //constantes (precio huevera y numero de huevos por huevera)
    final int Hueveras = 12;
    final double PrecioHuevera = 2.35;
   

    //calculos
    int HueverasLLenas = HuevosRecogidos / Hueveras;
    int HuevosSobrantes = HuevosRecogidos % Hueveras;
    double Ingresos = Hueveras * PrecioHuevera;

    System.out.println(NombreGranja + " con numero sanitario: " + NumeroSanitario);
    System.out.println("Huevos de la talla: " + TallaHuevos);
    System.out.println("Ecologicos: " + Ecologicos);
    System.out.println("Se han recogido y vendido un total de: " + HueverasLLenas + " hueveras llenas.");
    System.out.println("Se han ingresado un total de " + Ingresos + " euros");
    System.out.println("Han sobrado un total de: " + HuevosSobrantes + " sobrantes");
   





    }
}
