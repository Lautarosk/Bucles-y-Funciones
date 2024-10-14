/*
public class NumerosPerfectos {

    public static void main(String[] args) {
        System.out.println("Números perfectos del 1 al 100:");

        for (int num = 1; num <= 100; num++) {
            if (esNumeroPerfecto(num)) {
                System.out.println(num);
            }
        }
    }

    // Función para verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;

        // Calcular la suma de los divisores propios
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Un número es perfecto si la suma de sus divisores es igual al propio número
        return sumaDivisores == numero;
    }
}
*/

/*
import java.util.Scanner;

public class Factoriales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

         for (int i = 0; i <= N; i++) {
            long factorial = calcularFactorial(i);
            System.out.println("El factorial de " + i + " es: " + factorial);
        }

        scanner.close();
    }

    public static long calcularFactorial(int numero) {
        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i; // Multiplicar cada número hasta llegar al factorial
        }

        return resultado;
    }
}


 */

/*
import java.util.Scanner;

public class SumaFactoriales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número N
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        // Calcular la suma de los factoriales
        long suma = 0;
        for (int i = 0; i <= N; i++) {
            suma += calcularFactorial(i);
        }

        // Mostrar el resultado
        System.out.println("La suma de los factoriales de los números desde 0 hasta " + N + " es: " + suma);

        scanner.close();
    }

    // Función para calcular el factorial de un número
    public static long calcularFactorial(int numero) {
        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i; // Multiplicar cada núm


 */