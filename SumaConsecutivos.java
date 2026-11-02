import java.util.Scanner;

public class SumaConsecutivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo N: ");
        int n = teclado.nextInt();
        
        int suma = 0; // Variable acumuladora
        
        // El bucle va desde 1 hasta N
        for (int i = 1; i <= n; i++) {
            suma = suma + i; // Sumamos el valor actual de 'i'
        }
        
        System.out.println("La suma de los números es: " + suma);
        
        teclado.close();
    }
}
