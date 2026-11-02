import java.util.Scanner;

public class VentasSemanales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ventaTotal = 0;
        double mayorVenta = Double.MIN_VALUE;
        int diaMayorVenta = 0;

        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Ingrese el monto vendido el Día " + dia + ": ");
            double venta = teclado.nextDouble();
            ventaTotal += venta;

            if (venta > mayorVenta) {
                mayorVenta = venta;
                diaMayorVenta = dia;
            }
        }

        double promedio = ventaTotal / 7;
        System.out.println("\nVenta total: S/ " + ventaTotal);
        System.out.printf("Promedio: S/ %.2f\n", promedio);
        System.out.println("Mayor venta: Día " + diaMayorVenta);
        teclado.close();
    }
}
