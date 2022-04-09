package main;

import java.util.Scanner;

public class Menu {

    static Scanner scanner; // Inicializar le escaner para recibir el imput del susario
    static int valor; /*
                       * Inicializar la variable valor para capturar el numero introducido por el
                       * usuario
                       */
    static int choice;// Inicializar la variable choice para capturar la eleccion de usuario
    static boolean seguir = true; //

    public static void main(String[] args) {
        clear();
        menu();
    }

    static void menu() {
        // Miemtras la variable seguir sea true se ejecutara el while
        while (seguir) {

            // pedirle al usuario que escoga una opcion y esperar una respuesta
            System.out.println("Escoge uma opcion");
            System.out.println(
                    "1 - Capturar Valor \n2 - Generar Tabla de Multiplicar \n3 - Determinar Si es Primo o No Primo \n4 - Capturar una Matriz 4 x 4: Desplegar la Diagonal Principal* y Secundaria \n5 - Salir del Programa");
            scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            /*
             * Llamar a X funcion segun el valor que el usuario ingrese, si el valor no se
             * encuamtra en las opciones se finalizara el programa
             */
            switch (choice) {
                case 1:
                    capValor();
                    break;
                case 2:
                    procedimientoTablaMultiplicar();
                    break;
                case 3:
                    procedimientoMostrarEvaluacionPrimo();
                    break;
                case 4:
                    procedimientoDiagonalesMatriz();
                    break;
                case 5:
                    seguir = false;
                default:
                    seguir = false;
            }
        }
    }

    // Capturar el valor del usuario
    private static void capValor() {
        System.out.println("imgresa el valor");
        valor = scanner.nextInt();
        System.out.println(valor);
        clear();
        menu();
    }

    /*
     * Generar una tabla de Multiplicar hasta usando la variable valor como
     * multiplicando y como multiplicador los mumenor del 1 al 12
     */
    private static void procedimientoTablaMultiplicar() {
        for (int i = 1; i <= 12; i++) {
            System.out.println(valor + "x" + i + "=" + valor * i);
        }

        clear();
        menu();
    }

    private static void procedimientoMostrarEvaluacionPrimo() {
        // TODO primo o no primo
        clear();
        menu();
    }

    private static void procedimientoDiagonalesMatriz() {
        // TODO Cal la matriz
        clear();
        menu();
    }

    /*
     * Esta funcion se utilizara para limpiar la pantalla luego de realizar uan
     * operacion
     */
    static void clear() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
