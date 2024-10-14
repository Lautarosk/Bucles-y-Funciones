/*
import java.util.Scanner;

public class RegistroActividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] horas = new double[4];
        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
        double tiempoTotal = 0;


        for (int i = 0; i < actividades.length; i++) {
            System.out.print("Ingrese las horas dedicadas a " + actividades[i] + ": ");
            horas[i] = scanner.nextDouble();
            tiempoTotal += horas[i];  // Sumamos directamente al tiempo total
        }


        System.out.println("\nResumen de horas dedicadas:");
        for (int i = 0; i < actividades.length; i++) {
            System.out.println(actividades[i] + ": " + horas[i] + " horas");
        }

        System.out.println("\nTiempo total dedicado: " + tiempoTotal + " horas");

        scanner.close();
    }
}
*/

/*

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();


        final double tarifaPorHora = 15.0;


        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.print("Ingrese las horas trabajadas para el empleado " + i + ": ");
            double horasTrabajadas = scanner.nextDouble();


            double salarioSemanal = horasTrabajadas * tarifaPorHora;


            System.out.println("El salario semanal del empleado " + i + " es: $" + salarioSemanal);
        }

        scanner.close();
    }
}
*/

/*

import java.util.Scanner;

public class InventarioTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el número de productos: ");
        int numeroDeProductos = scanner.nextInt();


        boolean necesitaPedido = false;


        for (int i = 1; i <= numeroDeProductos; i++) {
            System.out.print("Ingrese la cantidad disponible del producto " + i + ": ");
            int cantidadDisponible = scanner.nextInt();


            if (cantidadDisponible < 5) {
                System.out.println("Es necesario realizar un pedido para el producto " + i + ".");
                necesitaPedido = true; // Cambiar a true si se necesita pedido
            }
        }


        if (!necesitaPedido) {
            System.out.println("Todos los productos tienen suficiente inventario.");
        }

        scanner.close();
    }
}
 */

/*

import java.util.Scanner;

public class HorasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de empleados
        System.out.print("Ingrese el número de empleados: ");
        int numeroDeEmpleados = scanner.nextInt();

        // Bucle para ingresar las horas trabajadas por cada empleado
        for (int i = 1; i <= numeroDeEmpleados; i++) {
            System.out.print("Ingrese las horas trabajadas por el empleado " + i + ": ");
            int horasTrabajadas = scanner.nextInt();

            // Verificar si se trabajaron más de 40 horas
            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + i + " trabajó " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + i + " no trabajó horas extras.");
            }
        }

        scanner.close();
    }
}

 */