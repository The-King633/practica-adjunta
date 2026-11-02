import java.util.Scanner;

public class CalculoFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = teclado.nextInt();

        long factorial = 1; // Usamos long por si el resultado es muy grande

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
        teclado.close();
    }
}
