package main;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

	static Scanner scanner; // * Inicializar le escaner para recibir el imput del susario
	static int valor; /*
						 * Inicializar la variable valor para capturar el numero introducido por el
						 * usuario
						 */
	static int choice;// * Inicializar la variable choice para capturar la eleccion de usuario
	static boolean seguir = true; //
	static boolean primo;
	static int matriz[][] = new int[4][4];

	// * colores para la consola
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) {
		clear();
		menu();
	}

	static void menu() {
		// * Miemtras la variable seguir sea true se ejecutara el while
		while (seguir) {

			// * pedirle al usuario que escoga una opcion y esperar una respuesta
			System.out.println(ANSI_CYAN + "Escoge uma opcion" + ANSI_RESET);
			System.out.println(ANSI_BLUE +
					"1 - Capturar Valor \n2 - Generar Tabla de Multiplicar \n3 - Determinar Si es Primo o No Primo \n4 - Capturar una Matriz 4 x 4: Desplegar la Diagonal Principal* y Secundaria \n5 - Salir del Programa \n6 - Mostrar el valor"
					+ ANSI_RESET);
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
					break;
				case 6:
					System.out.println(valor);
					clear();
					break;
				default:
					seguir = false;
					break;
			}
		}
	}

	// * Capturar el valor del usuario
	private static void capValor() {
		System.out.println(ANSI_BLUE + "insgresa el valor" + ANSI_RESET);
		valor = scanner.nextInt();
		clear();
		menu();
	}

	/*
	 * Generar una tabla de Multiplicar hasta usando la variable valor como
	 * multiplicando y como multiplicador los mumenor del 1 al 12
	 */
	private static void procedimientoTablaMultiplicar() {
		for (int i = 1; i <= 12; i++) {
			System.out.println(ANSI_CYAN + valor + "x" + i + "=" + valor * i + ANSI_RESET);
		}

		clear();
		menu();
	}

	// * Calcular si un numero es primo o no primo
	private static void procedimientoMostrarEvaluacionPrimo() {

		primo = true;
		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				primo = false;
				break;
			}
		}
		if (primo) {
			System.out.println(ANSI_GREEN + "Es primo" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "No es primo" + ANSI_RESET);
		}

		clear();
		menu();
	}

	private static void procedimientoDiagonalesMatriz() {
		System.out.println("Escribir datos de la matriz ");
		for (int f = 0; f <= 3; f++) {
			for (int c = 0; c <= 3; c++) {
				System.out.print("Escribir valor " + f + " , " + c + " : ");
				scanner = new Scanner(System.in);
				int dato = scanner.nextInt();
				matriz[f][c] = dato;
			}
		}

		for (int matrizInt[] : matriz) {
			System.out.println(Arrays.toString(matrizInt));
		}

		clear();

		menu();

	}

	/*
	 * Esta funcion se utilizara para limpiar la pantalla luego de realizar uan
	 * operacion
	 */
	static void clear() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
