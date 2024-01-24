import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private static Queue<Integer> cola = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            ejecutarOpcion(opcion, scanner);
        } while (opcion != 5);}


    private static void mostrarMenu() {
            System.out.println("                                 ** Menú de la Cola **");
            System.out.println(" ");
            System.out.println("[-] 1. Insertar dato            [-] 2. Mostrar datos              [-] 3. Vaciar cola");
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
                vaciarCola();
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
        System.out.print("Ingrese el dato a insertar: ");
        int dato = scanner.nextInt();
        cola.offer(dato);
        System.out.println("Dato insertado correctamente");
    }

    private static void mostrarDatos() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía");
        } else {
            System.out.println("Contenido de la cola (FIFO):");
            for (Integer dato : cola) {
                System.out.println(dato);
            }
        }
    }

    private static void vaciarCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía");
        } else {
            cola.clear();
            System.out.println("Cola vaciada correctamente");
        }
    }

    private static void comprobarVacia() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía");
        } else {
            System.out.println("La cola no está vacía");
        }
    }
}