public class ejercicio16 {
    public static void main(String[] args) {

        double altura = Double.parseDouble(System.console().readLine("Altura: "));
        double peso = Double.parseDouble(System.console().readLine("Peso: "));

        double Alturax2 = altura * altura;
        double IMC = peso / Alturax2;

        System.out.println("Tienes un IMC de: " + IMC);
    }
}
