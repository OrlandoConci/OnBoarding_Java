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
        //validarPrimos();

        // 7
        int [] arrayNumeros = {50, 80, 13, 35, 43, 85, 17, 7, 2};
        //acumularArray(arrayNumeros);

        // 8
        //mostrarParesSumarPrimos(arrayNumeros);

        // 9 + 10
        calculadora();

        // 11 + 12
        //boleteriaBowling();
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
        System.out.println("< BUSCAR EL MÁS GRANDE >");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número 1:");
        int number1 = scanner.nextShort();
        System.out.println("Ingrese el número 2:");
        int number2 = scanner.nextShort();
        System.out.println("Ingrese el número 3:");
        int number3 = scanner.nextShort();

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
        System.out.println("Analizar paridad:");
        int numero = validarMayorA(-1, "Ingrese un número del 1 en adelante:");

        if (esPar(numero)) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es Impar.");
        }

    }

    // validador
    public static int validarMayorA(int limiteMenor, String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean primeraVuelta = false;
        do {
            if (!primeraVuelta) {
                System.out.println(mensaje);
                numero = scanner.nextInt();
                primeraVuelta = true;
            } else {
                System.out.println("[Error] " + mensaje);
                numero = scanner.nextInt();
            }

        } while (numero <= limiteMenor);

        return numero;
    }

    // validador
    public static int validarDesdeHasta(int limiteMenor, int limiteMayor, String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean primeraVuelta = false;
        do {
            if (!primeraVuelta) {
                System.out.println(mensaje);
                numero = scanner.nextInt();
                primeraVuelta = true;
            } else {
                System.out.println("[Incorrecto] " + mensaje);
                numero = scanner.nextInt();
            }

        } while (numero < limiteMenor || numero > limiteMayor);

        return numero;
    }

    // 5
    public static void compararTextos() {
        System.out.println("-------------------------------------------------------");
        System.out.println("< COMPARAR TEXTOS >");
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

    public static void validarPrimos() {
        System.out.println("-------------------------------------------------------");
        System.out.println("< ANALIZAR PRIMOS >");
        int numero = validarMayorA(1, "Ingrese en número a partir del 2 en adelante:");

        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }
    public static boolean esPrimo(int numero) {

        boolean divisible = true;
        for (int i = numero-1; i > 1; i--) {
            if(numero % i == 0) {
                divisible = false;
                break;
            }
        }
        return divisible;
    }

    // 7
    public static void acumularArray(int[] arrayNumeros) {
        System.out.println("-------------------------------------------------------");
        System.out.println("< ACUMULAR IMPARES DE UN ARRAY >");
        int acumulador = 0;
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (!esPar(arrayNumeros[i])) {
                acumulador += arrayNumeros[i];
            }
        }
        System.out.println("La cantidad acumulada de impares es: " + acumulador);
    }

    // 8
    public static void mostrarParesSumarPrimos(int[] arrayNumeros) {
        System.out.println("-------------------------------------------------------");
        System.out.println("< MOSTRAR PARES Y SUMAR PRIMOS >");
        int acumuladorPrimos = 0;
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (esPrimo(arrayNumeros[i])) {
                acumuladorPrimos += arrayNumeros[i];
            }
            if (esPar(arrayNumeros[i])) {
                System.out.println("- Par: " + arrayNumeros[i]);
            }
        }
        System.out.println("-->");
        System.out.println("Sumatoria de números primos: " + acumuladorPrimos);
    }

    // 9

    public static int menuCalculadora() {
        System.out.println("--------------------------");
        int opcion = -1;
        System.out.println("Menú de Opciones:");
        System.out.println("1)_ Sumar.");
        System.out.println("2)_ Restar.");
        System.out.println("3)_ Multiplicar.");
        System.out.println("4)_ Dividir.");
        System.out.println("0)_ Salir de la Calculadora.");
        opcion = validarDesdeHasta(0, 4, "Ingrese un número entre 0 y 4: ");
        return opcion;
    }

    // 10
    public static void calculadora() {
        System.out.println("-------------------------------------------------------");
        System.out.println("< CALCULADORA >");
        int opcion = menuCalculadora();
        Scanner scanner = new Scanner(System.in);
        while (opcion != 0) {
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
                    float dividendo = validarMayorA(0, "Ingrese el dividendo: ");
                    float divisor = validarMayorA(0, "Ingrese el divisor (Distinto de cero): ");
                    System.out.println("Resultado Dividir: " + (dividendo / divisor));
                    break;
            }
            opcion = menuCalculadora();
        }
        System.out.println("--------------------------");
        System.out.println("Finalizado");
    }

    // 11

    public static int menuBowling() {
        System.out.println("---------------------------");
        System.out.println("1)_ Ingresar Datos.");
        System.out.println("2)_ Ver Capacidad disponible.");
        System.out.println("3)_ Ver Dinero recaudado.");
        System.out.println("4)_ Ver lista de participantes.");
        System.out.println("0)_ Cerrar sesión en el sistema.");
        return validarDesdeHasta(0, 4, "Ingrese un valor entre 0 y 4: ");
    }

    // 12
    public static void boleteriaBowling() {
        System.out.println("-------------------------------------------------------");
        System.out.println("< MENU BOWLING >");

        short ocupacion = 0;
        int dineroRecaudado = 0;
        String[] nombres = new String[500];
        byte[] edades = new byte[500];
        String[] documentos = new String[500];
        short[] entradas = new short[500];

        int opcion = menuBowling();

        while (opcion != 0) {
            Scanner scanner = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    if (ocupacion < 500) {
                        System.out.println("--------------------------");
                        System.out.println("< INGRESAR DATOS >");
                        System.out.println("Edad: ");
                        byte edad = scanner.nextByte();
                        if (edad >= 21) {
                            System.out.println("Nombre y apellido: ");
                            String nombreYApellido = scanner.next();
                            System.out.println("DNI: ");
                            String dni = scanner.next();
                            int pase = validarDesdeHasta(1, 3, "Tipo de pase 1-Normal 2-VIP 3-No tengo");
                            short valorEntrada = 0;
                            int comprar = 0;
                            if (pase == 3) {
                                System.out.println("Usted no posee entrada.");
                                comprar = validarDesdeHasta(1, 2, "Seleccione la opción a comprar: 1)_Normal 2)_vip");
                            }
                            if(pase == 2 || comprar == 2) {
                                int tipoPase = validarDesdeHasta(1, 3, "Tipo de pase VIP 1-Gratuito 2-C/descuento 3-Común");
                                if (tipoPase == 3) {
                                    System.out.println("Precio a pagar: $2000");
                                    valorEntrada = 2000;
                                } else if (tipoPase == 2) {
                                    System.out.println("Precio a pagar: $1000");
                                    valorEntrada = 1000;
                                } else {
                                    System.out.println("Pase gratuito.");
                                }

                            } else if(pase == 1 || comprar == 1) {
                                System.out.println("Precio a pagar: $1500");
                                valorEntrada = 1500;

                            }
                            dineroRecaudado += valorEntrada;
                            System.out.println("Bienvenido " + nombreYApellido);

                            nombres[ocupacion] = nombreYApellido;
                            edades[ocupacion] = edad;
                            documentos[ocupacion] = dni;
                            entradas[ocupacion] = valorEntrada;
                            ocupacion += 1;


                        } else {
                            System.out.println("Acceso denegado - solo para mayores de 21.");
                        }

                    } else {
                        System.out.println("Capacidad total alcanzada: (500/500)");
                    }

                    break;
                case 2:
                    System.out.println("--------------------------");
                    if(ocupacion == 500) {
                        System.out.println("Capacidad total alcanzada: (500/500)");
                    } else {
                        System.out.println("Ocupación: (" + ocupacion + "/500) Disponibles: " + (500-ocupacion));
                    }
                    break;
                case 3:
                    System.out.println("--------------------------");
                    System.out.println("Dinero total recaudado: $" + dineroRecaudado);
                    break;
                case 4:
                    System.out.println("--------------------------");
                    System.out.println("< PARTICIPANTES >");
                    if (nombres[0] != null) {
                        for (int i = 0; i < nombres.length; i++) {
                            if (nombres[i] != null) {
                                System.out.println(i + 1 + ")_ " + nombres[i]);
                                System.out.println("Edad: " + edades[i]);
                                System.out.println("DNI: " + documentos[i]);
                                System.out.println("Valor entrada: " + entradas[i]);
                                System.out.println("-------------");
                            }
                        }
                    } else {
                        System.out.println("Sin participantes.");
                    }
            }
            opcion = menuBowling();
        }
        System.out.println("--------------------------");
        System.out.println("Sesión Cerrada.");
    }
}
// Fin
