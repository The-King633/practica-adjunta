import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double suma = 0;
        double notaMayor = Double.MIN_VALUE; // Inicializa con el valor más bajo posible
        double notaMenor = Double.MAX_VALUE; // Inicializa con el valor más alto posible

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del estudiante " + i + ": ");
            double nota = teclado.nextDouble();
            suma += nota;

            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }

        double promedio = suma / 10;
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Mayor nota: " + notaMayor);
        System.out.println("Menor nota: " + notaMenor);
        teclado.close();
    }
}
