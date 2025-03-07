// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
// Ejemplo:


package ui;

import java.util.Scanner;

public class AtlasPuntuaciones {

    private Scanner escaner;

    private AtlasPuntuaciones() {
        escaner = new Scanner(System.in);
    }

    public void run() {
        int numjugadores, numrondas;

        System.out.println("# Ingrese el numero de jugadores.");
        System.out.print("> ");
        numjugadores = escaner.nextInt();
        int[] puntaje = new int[numjugadores];

        System.out.println("# Ingrese el numero de rondas.");
        System.out.print("> ");
        numrondas = escaner.nextInt();

        int suma = 0;

        for (int i = 0; i < numjugadores; i++) {

            for (int j = 0; j < numrondas; j++) {
                System.out.println("# Ingrese el puntaje del jugador " + (i + 1) + " de la ronda " + (j + 1));
                System.out.print("> ");
                puntaje[i] = escaner.nextInt();

                suma += puntaje[i];
            }
            double prom = calcularPromedio(puntaje, numrondas);
            System.out.println("");
            System.out.println("# El puntaje total del jugador " + (i + 1) + " es de: " + suma + " y el promedio es de: " + prom);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
        mainApp.run();
    }

    /**
     * Descripción: El método encontrarMayor permite ...
     * @param double[] numeros
     * @return 
     */
	public int calcularSumaTotal(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    /**
     * Descripción: El método encontrarMayor permite ...
     * @param double[] numeros
     * @return 
     */
	public double calcularPromedio(int[] numeros, int numrondas) {
        int sum = 0;

        for (int i = 0; i < numrondas; i++) {
            suma += numeros[i];
        }
        return (double) suma / numrondas;
    }

    /**
     * Descripción: El método encontrarMayor permite ...
     * @param double[] numeros
     * @return 
     */
    public double encontrarMayor(double[] numeros) {
        // Completar
        return 0;
	}