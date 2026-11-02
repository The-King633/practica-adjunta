import java.util.Scanner;

public class ConteoParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int sumaPares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = teclado.nextInt();

            if (num % 2 == 0) {
                pares++;
                sumaPares += num;
            } else {
                impares++;
            }
        }

        System.out.println("\nPares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Suma de pares: " + sumaPares);
        teclado.close();
    }
}
