public class ejercicio28 {
    public static void main(String[] args) {
        
        //creamos variables.

        String nombreyapellido = "jose frasquier";
        String numerosocio = "5213";
        char turno = 'M';
        boolean taquilla = true;
        int Meses = 29;

        //constantes.
         final double cuota = 34.90;
         final int preciotaquilla = 5;
         final int turnotarde = 5;


         //calculos

         double cuotamastaquilla = cuota + preciotaquilla;
         double cuotamastaquillaytarde = cuota + preciotaquilla + turnotarde;
         double cuotamastarde = cuota + turnotarde;



        System.out.println("si te apuntas por la mañana sin taquilla, te costara: " + cuota + " euros");
        System.out.println("si te apuntas por la mañana con taquilla, te costara: " + cuotamastaquilla + " euros");
        System.out.println("si te apuntas por la tarde sin taquilla, te costara: " + cuotamastarde + " euros");
        System.out.println("si te apuntas por la tarde con taquilla, te costara: " + cuotamastaquillaytarde + " euros");
        


    }
}
