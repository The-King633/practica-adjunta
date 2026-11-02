import java.util.Scanner;

public class AnalisisSalarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double planillaTotal = 0;
        double sueldoMayor = Double.MIN_VALUE;
        double sueldoMenor = Double.MAX_VALUE;
        int masDe2500 = 0;

        for (int i = 1; i <= 25; i++) {
            System.out.print("Ingrese el sueldo del trabajador " + i + ": S/ ");
            double sueldo = teclado.nextDouble();
            
            planillaTotal += sueldo;

            if (sueldo > sueldoMayor) sueldoMayor = sueldo;
            if (sueldo < sueldoMenor) sueldoMenor = sueldo;
            if (sueldo > 2500) masDe2500++;
        }

        double promedio = planillaTotal / 25;

        System.out.println("\nPlanilla total: S/ " + planillaTotal);
        System.out.println("Promedio: S/ " + promedio);
        System.out.println("Mayor sueldo: S/ " + sueldoMayor);
        System.out.println("Menor sueldo: S/ " + sueldoMenor);
        System.out.println("Trabajadores con sueldo > S/2500: " + masDe2500);
        teclado.close();
    }
}
