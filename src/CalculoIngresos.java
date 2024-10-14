/*
import java.util.Scanner;

public class CalculoIngresos {


    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0.0;
        for (double venta : ventas) {
            total += venta; // Sumar cada venta al total
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] ventas = new double[30];


        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese las ventas del día " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }


        double totalIngresos = calcularIngresosMensuales(ventas);


        System.out.println("El total de ingresos mensuales es: $" + totalIngresos);

        scanner.close();
    }
}
*/

/*

public class ReporteInventario {

    // Función para generar el reporte de productos con bajo stock
    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Reporte de productos con bajo stock (menos de 5 unidades):");
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + ": " + stocks[i] + " unidades");
            }
        }
    }

    public static void main(String[] args) {
        // Arreglos de productos y stock
        String[] productos = {
                "Televisor",
                "Computadora",
                "Auriculares",
                "Teclado",
                "Mouse",
                "Proyector",
                "Cámara",
                "Impresora"
        };

        int[] stocks = {3, 12, 1, 7, 4, 0, 6, 2}; // Cantidades de stock de cada producto


    }
}


 */
/*
public class GestionClientes {

    // Función para enviar facturas a clientes con deudas mayores a $500
    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + ": $" + facturasPendientes[i]);
            }
        }
    }

    public static void main(String[] args) {

        String[] clientes = {
                "Juan Pérez",
                "Ana Gómez",
                "Luis Rodríguez",
                "María López",
                "Carlos Martínez"
        };

        double[] facturasPendientes = {450.0, 600.5, 200.0, 750.75, 300.0}; // Montos de facturas pendientes


        enviarFacturas(clientes, facturasPendientes);
    }
}


 */

/*
public class CalculoDescuentos {

    // Función para calcular descuentos para los clientes
    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Descuentos para clientes:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                double descuento = 0.10; // 10% de descuento
                System.out.println(clientes[i] + " califica para un descuento del " + (descuento * 100) + "%.");
            } else {
                System.out.println(clientes[i] + " no califica para descuentos.");
            }
        }
    }

    public static void main(String[] args) {
        // Arreglos de clientes y cantidad de compras
        String[] clientes = {
                "Juan Pérez",
                "Ana Gómez",
                "Luis Rodríguez",
                "María López",
                "Carlos Martínez"
        };

        int[] compras = {5, 12, 8, 15, 7}; // Cantidad de compras de cada cliente

        // Calcular y mostrar descuentos
        calcularDescuentos(clientes, compras);
    }
}


 */

/*

public class PromedioSatisfaccion {


    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int suma = 0;

        for (int calificacion : calificaciones) {
            suma += calificacion; // Sumar cada calificación
        }

        return (double) suma / calificaciones.length; // Calcular el promedio
    }

    public static void main(String[] args) {

        int[] calificaciones = {4, 5, 3, 4, 2, 5, 3, 4, 4, 5}; // Ejemplo de puntuaciones


        double promedio = calcularPromedioSatisfaccion(calificaciones);


        System.out.println("El promedio de satisfacción del cliente es: " + promedio);
    }
}


 */