import java.util.Scanner;
import java.util.Stack;

public class Pila {
    private static Stack<Integer> pila = new Stack<Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            ejecutarOpcion(opcion, scanner);
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
            System.out.println("                                 ** Menú de la Cola **");
            System.out.println(" ");
            System.out.println("[-] 1. Insertar dato            [-] 2. Mostrar datos              [-] 3. Vaciar pila");
            System.out.println("[-] 4. Comprobar contenido      [-] 5. Salir");
            System.out.println(" ");
            System.out.print("[-] Elija una opción:");
    }

    private static void ejecutarOpcion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                insertarDato(scanner);
                break;
            case 2:
                mostrarDatos();
                break;
            case 3:
                vaciarPila();
                break;
            case 4:
                comprobarVacia();
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    private static void insertarDato(Scanner scanner) {
        if (pila.size() >= 5) {
            System.out.println("La pila está llena");
        } else {
            System.out.print("Ingrese el dato a insertar: ");
            int dato = scanner.nextInt();
            pila.push(dato);
            System.out.println("Dato insertado correctamente");
        }
    }

    // Metodo mostrar conforme al principio Last input first output
    private static void mostrarDatos() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("Contenido de la pila (LIFO):");
            for (int i = pila.size() - 1; i >= 0; i--) {
                System.out.println(pila.get(i));
            }
        }
    }


    private static void vaciarPila() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía");
        } else {
            pila.clear();
            System.out.println("Pila vaciada correctamente");
        }
    }

    private static void comprobarVacia() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("La pila no está vacía");
        }
    }
}