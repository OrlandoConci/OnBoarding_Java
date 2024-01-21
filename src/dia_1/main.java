package dia_1;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // 2
        //bienvenida();

        // 1
        //presentacion();

        // 3
        //elMasGrande();

        // 4
        //paridad();

        // 5
        //compararTextos();

        // 6
        //esPrimo();

        // 7
        // int [] arrayNumeros = {50, 80, 35, 85, 17};
        // acumularArray(arrayNumeros);

    }

    // 1
    public static void presentacion(){
        String nombre = "Orlando";
        String apellido = "Conci";
        byte edad = 22;

        System.out.println("Hola me llamo " + nombre + " " + apellido + " y tengo " + edad + " años.");

    }

    // 2
    public static void bienvenida() {
        System.out.println("Bienvenidos a la consola Devs");
    }

    // 3
    public static void elMasGrande() {
        System.out.println("-------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número 1:");
        Short number1 = scanner.nextShort();
        System.out.println("Ingrese el número 2:");
        Short number2 = scanner.nextShort();
        System.out.println("Ingrese el número 3:");
        Short number3 = scanner.nextShort();

        int[] arrayNumeros = {number1, number2, number3};

        if (number1 > number2 && number1 > number3) {
            System.out.println("El más grande es " + number1);
        } else if (number2 > number1 && number2 > number3){
            System.out.println("El más grande es " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("El más grande es " + number3);
        } else {
            System.out.println("Los tres números son iguales.");
        }
    }

    // 4
    public static boolean esPar(int numero) {
        boolean paridad = numero % 2 == 0;

        return paridad;
    }

    public static void paridad() {
        System.out.println("-------------------------------------------------------");
        int numero = validarMayorA(-1);

        if (esPar(numero)) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es Impar.");
        }

    }

    // validador
    public static int validarMayorA(int limiteMayor) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean primeraVuelta = false;
        do {
            if (!primeraVuelta) {
                System.out.println("Ingrese el número a analizar mayor a " + limiteMayor + ": ");
                numero = scanner.nextInt();
                primeraVuelta = true;
            } else {
                System.out.println("[Incorrecto] Ingrese el número a analizar mayor a " + limiteMayor + ": ");
                numero = scanner.nextInt();
            }

        } while (numero <= limiteMayor);

        return numero;
    }

    // validador
    public static int validarDesdeHasta(int limiteMenor, int limiteMayor) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean primeraVuelta = false;
        do {
            if (!primeraVuelta) {
                System.out.println("Ingrese un número entre " + limiteMenor + " - " + limiteMayor + ".");
                numero = scanner.nextInt();
                primeraVuelta = true;
            } else {
                System.out.println("[Incorrecto] Ingrese un número entre " + limiteMenor + " - " + limiteMayor + ".");
                numero = scanner.nextInt();
            }

        } while (numero < limiteMenor || numero > limiteMayor);

        return numero;
    }

    // 5
    public static void compararTextos() {
        System.out.println("-------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer texto a comparar:");
        String texto1 = scanner.next();

        System.out.println("Ingrese el segundo texto a comparar:");
        String texto2 = scanner.next();

        if(texto1.equals(texto2)) {
            System.out.println("Ambos textos ingresados son iguales.");
        } else {
            System.out.println("Ambos textos ingresados no son iguales.");
        }

    }
    // 6
    public static void esPrimo() {
        System.out.println("-------------------------------------------------------");
        int numero = validarMayorA(1);
        boolean divisible = false;
        for (int i = numero-1; i > 1; i--) {
            System.out.println(i);
            if(numero % i == 0) {
                divisible = true;
                break;
            }
        }
        if (divisible) {
            System.out.println(numero + " no es primo.");
        } else {
            System.out.println(numero + " es primo.");
        }
    }

    // 7
    public static void acumularArray(int[] arrayNumeros) {
        System.out.println("-------------------------------------------------------");
        int acumulador = 0;
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (!esPar(arrayNumeros[i])) {
                acumulador += arrayNumeros[i];
            }
        }
        System.out.println("La cantidad acumulada de impares es: " + acumulador);
    }
}
