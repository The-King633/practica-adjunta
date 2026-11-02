import java.util.Scanner;

public class TrianguloNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Solicite un número N: ");
        int n = teclado.nextInt();

        // Bucle externo controla las filas
        for (int i = 1; i <= n; i++) {
            // Bucle interno controla qué números se imprimen por fila
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Salto de línea al terminar la fila
        }
        teclado.close();
    }
}
