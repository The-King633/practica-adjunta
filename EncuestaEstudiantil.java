import java.util.Scanner;

public class EncuestaEstudiantil {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int excelente = 0, bueno = 0, regular = 0, malo = 0;

        System.out.println("Opciones: 1=Excelente | 2=Bueno | 3=Regular | 4=Malo");
        for (int i = 1; i <= 30; i++) {
            System.out.print("Voto del estudiante " + i + ": ");
            int voto = teclado.nextInt();

            switch (voto) {
                case 1 -> excelente++;
                case 2 -> bueno++;
                case 3 -> regular++;
                case 4 -> malo++;
                default -> }
                
                    System.out.println("Opción inválida. Intente de nuevo.");
                    i--; // Decrementa para repetir el voto del estudiante actual
                }
            }
        }

        System.out.println("\nExcelente: " + excelente);
        System.out.println("Bueno: " + bueno);
        System.out.println("Regular: " + regular);
        System.out.println("Malo: " + malo);

        // Determinar la opción más votada
        String masVotada = "Excelente";
        int maxVotos = excelente;

        if (bueno > maxVotos) { maxVotos = bueno; masVotada = "Bueno"; }
        if (regular > maxVotos) { maxVotos = regular; masVotada = "Regular"; }
        if (malo > maxVotos) { maxVotos = malo; masVotada = "Malo"; }

        System.out.println("Opción más votada: " + masVotada);
        teclado.close();
    }
}
