import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Solicite un número: ");
        int numero = teclado.nextInt();
        
        int sumaTotal = 0; // Acumulador para los resultados
        
        System.out.println("\n--- Tabla del " + numero + " ---");
        // El bucle se repite exactamente 15 veces
        for (int i = 1; i <= 15; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            
            sumaTotal = sumaTotal + resultado; // Guardamos el resultado en la suma total
        }
        
        System.out.println("\nSuma total = " + sumaTotal);
        
        teclado.close();
    }
}
