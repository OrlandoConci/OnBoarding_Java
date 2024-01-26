package dia_4;

public class Main {
    public static void main(String[] args) {
        CalculadoraConMenu calculadora = new CalculadoraConMenu();
        byte opcion;
        do {
            opcion = calculadora.init();
            if (opcion == 0){
                System.out.println("Calculadora Off.");
            }
        } while(opcion != 0);
    }
}
