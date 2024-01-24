import java.util.Scanner;

public class Recursividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calcular factorial");
            System.out.println("2. Calcular sumatoria");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            if (option == 1 || option == 2) {
                do {
                    System.out.print("Ingresa un número: ");
                    int n = scanner.nextInt();
                    long result = (option == 1) ? factorial(n) : sumatoria(n);
                    System.out.println((option == 1 ? "Factorial" : "Sumatoria") + " de " + n + " es " + result);

                    System.out.print("¿Deseas calcular nuevamente? (1: Sí / 2: No): ");
                    int repeatOption = scanner.nextInt();
                    if (repeatOption == 2) {
                        break;  // Sal del bucle interno
                    }
                } while (true);
            } else if (option != 3) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (option != 3);

        scanner.close();
        System.out.println("¡Hasta luego!");
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long sumatoria(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumatoria(n - 1);
    }
}