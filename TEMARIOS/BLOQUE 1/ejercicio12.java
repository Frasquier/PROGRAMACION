/* pregunta cuantos trozos tiene una tarta y cuantas personas van a comer, y
muestra cuantos trozos tocan por persona y cuantos sobran */


public class ejercicio12 {
    public static void main(String[] args) {

        int Trozostarta = Integer.parseInt(System.console().readLine("Numero de trozos: "));
        int Personas = Integer.parseInt(System.console().readLine("Personas: "));


        int TrozosXpersona = Trozostarta / Personas;
        int TrozosSobrantes = Trozostarta % Personas;

    
        System.out.println(TrozosXpersona + " trozos por persona");
                System.out.println(TrozosSobrantes+ " sobran");

        

    }
}
