public class ejercicio15 {
    public static void main(String[] args) {
    

        double GradosC = Double.parseDouble(System.console().readLine("introduce grados celsius: "));
        final double GradosK = 273.15;

        double GradosConvertidos = GradosC + GradosK;


        System.out.println("Serian un total de grados kelvin de: " + GradosConvertidos);
        

    }
}
