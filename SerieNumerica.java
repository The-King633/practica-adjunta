import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Solicite un número N: ");
        int n = teclado.nextInt();

        int suma = 0;
        int cantidad = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            suma += i;
            cantidad++;
        }

        System.out.println("\n\nCantidad: " + cantidad);
        System.out.println("Suma: " + suma);
        teclado.close();
    }
}
    