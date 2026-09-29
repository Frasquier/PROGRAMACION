public class ejercicio24 {
    public static void main(String[] args) {
        
        //creamos las variables.
        String NombrePlato = "Lentejas de la abuela";
        int GramosLentejas = 250;
        int GramosChorizo = 150;
        int Zanahorias = 2;
        int LitrosAgua = 1;
        boolean Vegetarianos = false;
        int NumeroComensales = Integer.parseInt(System.console().readLine("Cuantos comensales comeran hoy? "));

        //hacemos los calculos.
    
        int GramosLentejasXPersona = GramosLentejas * NumeroComensales;
        int GramosChorizoXPersona = GramosChorizo * NumeroComensales;
        int ZanahoriasXPersona = Zanahorias * NumeroComensales;
        int LitrosAguaXPersona = LitrosAgua * NumeroComensales;


        //mostramos por consola.
        System.out.println("Hoy comeran: " + NumeroComensales + " personas.");
        System.out.println("Necesitaremos los siguientes ingredientes:");
        System.out.println(GramosLentejasXPersona + " gramos de lentejas");
        System.out.println(GramosChorizoXPersona + " gramos de chorizo");
        System.out.println(ZanahoriasXPersona + " zanahorias");
        System.out.println(LitrosAguaXPersona + " litros de agua");


    }
}
