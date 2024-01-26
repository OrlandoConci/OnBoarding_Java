package dia_4;
import static dia_1.Main.validarMayorA;
import java.util.Scanner;

public class Calculadora implements CalculatorOperations {

    @Override
    public void calcularMultiple(byte opcion) {
        Scanner scanner = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("--------------------------");
                System.out.println("< SUMA >");
                int n = validarMayorA(1, "Ingrese la cantidad de números a sumar (mínimo 2):");
                int acumulador = 0;
                for (int i = 0; i < n; i++) {
                    System.out.println("Ingrese el " + (i+1) + "°" + " número:");
                    acumulador += scanner.nextInt();
                }
                System.out.println("Resultado Suma: " + acumulador);
                break;
            case 2:
                System.out.println("--------------------------");
                System.out.println("< RESTAR >");
                int n1 = validarMayorA(1, "Ingrese la cantidad de números a restar (mínimo 2):");
                int acumuladorResta = 0;
                for (int i = 0; i < n1; i++) {
                    System.out.println("Ingrese el " + (i+1) + "°" + " número:");
                    if (i == 0) {
                        acumuladorResta = scanner.nextInt();
                    } else {
                        acumuladorResta -= scanner.nextInt();
                    }
                }
                System.out.println("Resultado Resta: " + acumuladorResta);
                break;
            case 3:
                System.out.println("--------------------------");
                System.out.println("< Multiplicar >");
                int n2 = validarMayorA(1, "Ingrese la cantidad de números a multiplicar (mínimo 2):");
                int acumuladorMultiplicador = 0;
                for (int i = 0; i < n2; i++) {
                    System.out.println("Ingrese el " + (i+1) + "°" + " número:");
                    if (i == 0) {
                        acumuladorMultiplicador = scanner.nextInt();
                    } else {
                        acumuladorMultiplicador *= scanner.nextInt();
                    }
                }
                System.out.println("Resultado Multiplicación: " + acumuladorMultiplicador);
                break;
            case 4:
                System.out.println("--------------------------");
                System.out.println("< Dividir >");
                float dividendo = validarMayorA(0, "Ingrese el dividendo (Distinto de cero): ");
                float divisor = validarMayorA(0, "Ingrese el divisor (Distinto de cero): ");
                float resultado = (dividendo / divisor);
                System.out.println("Resultado Dividir: " + resultado);
                break;
        }
    }
}
