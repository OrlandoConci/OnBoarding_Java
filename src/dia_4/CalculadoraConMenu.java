package dia_4;

import java.util.Scanner;

public class CalculadoraConMenu implements CalculatorMenu{
    private CalculatorOperations calcular = new Calculadora();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void mostrarMenu() {
        System.out.println("--------------------------");
        System.out.println("Menú Calculadora:");
        System.out.println("1)_ Sumar.");
        System.out.println("2)_ Restar.");
        System.out.println("3)_ Multiplicar.");
        System.out.println("4)_ Dividir.");
        System.out.println("0)_ Salir de la Calculadora.");

    }

    public byte init() {
        mostrarMenu();
        byte opcion;
        System.out.println("Ingrese un número entre 0 y 4: ");
        opcion = scanner.nextByte();
        calcular.calcularMultiple(opcion);
        return opcion;
    }

}
