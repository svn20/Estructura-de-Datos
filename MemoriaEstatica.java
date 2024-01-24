import java.util.Scanner;

public class MemoriaEstatica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] calificaciones = new int[5]; 

   
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar calificaciones");
            System.out.println("2. Mostrar calificaciones");
            System.out.println("3. Calcular promedio de calificaciones");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarCalificaciones(calificaciones);
                    break;
                case 2:
                    mostrarCalificaciones(calificaciones);
                    break;
                case 3:
                    // Es llamado el metodo 3 //
                    double promedio = calcularPromedio(calificaciones);
                    System.out.println("El promedio de las calificaciones es: " + promedio);
                    break;
                case 4:
                    System.out.println("Bye Bye.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    // Metodo 1
    public static void ingresarCalificaciones(int[] calificaciones) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Ingrese las 5 calificaciones (separadas por espacios):");
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = scanner.nextInt();
        }

        System.out.println("Calificaciones ingresadas correctamente.");
    }

    // Metodo 2
    public static void mostrarCalificaciones(int[] calificaciones) {
        System.out.println("Estas son las calificaciones que ingresaste:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print(calificaciones[i] + " ");
        }
        System.out.println();
    }

    // Metodo 3
    public static double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        return (double) suma / calificaciones.length;
    }
}