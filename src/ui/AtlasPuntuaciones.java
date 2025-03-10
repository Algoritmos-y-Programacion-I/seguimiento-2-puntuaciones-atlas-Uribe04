/*

Analisis:

# Descripcion del programa:
> Este es un programa el cual sirve para llevar conteo del puntaje de un numero 
de jugadores que son establecidos por el usuario dentro de un torneo, en este programa
tambien se pregunta el numero de rondas y despues de esto el programa arroja como
resultado el puntaje total en las rondas, promedio y el jugador con puntaje mas alto.
en caso de no colocarse un valor correcto se va a volver a preguntar para que la persona
digite el valor correcto.

# Entradas:
> Numero de jugadores
> Numero de rondas
> Puntaje por ronda

# Salidas:
> Puntaje total de jugador en todas las rondas
> Promedio de puntaje del jugador en las rondas
> Se dice cual jugador tuvo el puntaje mas alto

# Ejemplo:

# Ingrese el numero de jugadores.
> 2
# Ingrese el numero de rondas.
> 2
# Ingrese el puntaje del jugador 1 en la ronda 1
> 40
# Ingrese el puntaje del jugador 1 en la ronda 2
> 60

# El puntaje total del jugador 1 es de: 100 y el promedio es de: 50.0

# Ingrese el puntaje del jugador 2 en la ronda 1
> 30
# Ingrese el puntaje del jugador 2 en la ronda 2
> 40

# El puntaje total del jugador 2 es de: 70 y el promedio es de: 35.0

# El jugador con el puntaje mas alto es el jugador 1 con un puntaje de: 100
*/


package ui;
import java.util.Scanner;

public class AtlasPuntuaciones {

    private Scanner escaner;

    public AtlasPuntuaciones() { 
        escaner = new Scanner(System.in);
    }

    public void run() {
        int numjugadores, numrondas;

        System.out.println("# Ingrese el numero de jugadores. (maximo 10)");
        System.out.print("> ");
        numjugadores = escaner.nextInt();
        while (numjugadores < 1 || numjugadores > 10) {
            System.out.println("# !ERROR! el numero maximo de jugadores es 10, porfavor digite denuevo.");
            System.out.print("> ");
            numjugadores = escaner.nextInt();
        }
        int[] puntajeTotal = new int[numjugadores];

        System.out.println("# Ingrese el numero de rondas. (maximo 5)");
        System.out.print("> ");
        numrondas = escaner.nextInt();
        while (numrondas < 1 || numrondas > 5) {
            System.out.println("# !ERROR! el numero maximo de rondas es 5, porfavor digite denuevo.");
            System.out.print("> ");
            numrondas = escaner.nextInt();
        }

        for (int i = 0; i < numjugadores; i++) {
            int suma = 0; 
            for (int j = 0; j < numrondas; j++) {
                System.out.println("# Ingrese el puntaje del jugador " + (i + 1) + " en la ronda " + (j + 1));
                System.out.print("> ");
                int puntaje = escaner.nextInt();
                while (puntaje > 100) {
                    System.out.println("# !ERROR! el numero maximo de puntaje es de 100, porfavor digite denuevo.");
                    System.out.print("> ");
                    puntaje = escaner.nextInt();
                }
                suma += puntaje;
            }
            puntajeTotal[i] = suma;
            double prom = (double) suma / numrondas;
            System.out.println("");
            System.out.println("# El puntaje total del jugador " + (i + 1) + " es de: " + suma + " y el promedio es de: " + prom);
            System.out.println("");
        }

        int jugadorMayor = encontrarMayor(puntajeTotal);
        System.out.println("# El jugador con el puntaje mas alto es el jugador " + (jugadorMayor + 1) + " con un puntaje de: " + puntajeTotal[jugadorMayor]);
    }

    public static void main(String[] args) {
        AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
        mainApp.run();
    }

    public int calcularSumaTotal(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    public double calcularPromedio(int[] numeros, int numrondas) {
        int suma = 0;
        for (int i = 0; i < numrondas; i++) {
            suma += numeros[i];
        }
        return (double) suma / numrondas;
    }

    public int encontrarMayor(int[] puntajes) {
        int indiceMayor= 0;
        for (int i = 1; i < puntajes.length; i++) {
            if (puntajes[i] > puntajes[indiceMayor]) {
                indiceMayor = i;
            }
        }
        return indiceMayor;
    }
}
