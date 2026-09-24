/*Pregunta al usuario cuanto dinero tiene en el banco. Despues pregunta cuanto quiere gastarse hoy y lo guuarda;
despues cuanto desea ingresar hoy y tambien lo guarda. Por ultimo, muestra el dinero que queda en la cuenta tras el gasto y el ingreso */

public class ejercicio14 {
    public static void main(String[] args) {
        
        double DineroEnBanco = Double.parseDouble(System.console().readLine("Cuanto dinero tienes en el banco? "));
        double DineroGastado = Double.parseDouble(System.console().readLine("Cuanto dinero quieres gastar hoy? "));

        DineroEnBanco = DineroEnBanco - DineroGastado;

        double DineroIngresado = Double.parseDouble(System.console().readLine("Cuanto dinero quieres ingresar hoy? "));

        DineroEnBanco = DineroEnBanco + DineroIngresado;



         System.out.println("El dinero que te queda a dia de hoy segun tus ingresos y gastos es: " + DineroEnBanco);



    }
}
