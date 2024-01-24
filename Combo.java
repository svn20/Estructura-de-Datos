import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Combo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa de Pilas y Colas");

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Utilizar Pila");
            System.out.println("2. Utilizar Cola");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    manejarPila();
                    break;
                case 2:
                    manejarCola();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void manejarPila() {
        Stack<Integer> pila = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOperaciones de Pila:");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Comprobar si la pila está vacía");
            System.out.println("4. Vaciar pila");
            System.out.println("5. Volver al menú principal");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    insertarEnPila(pila, scanner);
                    break;
                case 2:
                    mostrarPila(pila);
                    break;
                case 3:
                    comprobarPilaVacia(pila);
                    break;
                case 4:
                    vaciarPila(pila);
                    break;
                case 5:
                    return; 
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void manejarCola() {
        Queue<Integer> cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOperaciones de Cola:");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Mostrar cola");
            System.out.println("3. Comprobar si la cola está vacía");
            System.out.println("4. Vaciar cola");
            System.out.println("5. Volver al menú principal");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    insertarEnCola(cola, scanner);
                    break;
                case 2:
                    mostrarCola(cola);
                    break;
                case 3:
                    comprobarColaVacia(cola);
                    break;
                case 4:
                    vaciarCola(cola);
                    break;
                case 5:
                    return; 
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void insertarEnPila(Stack<Integer> pila, Scanner scanner) {
        System.out.println("Ingrese un número para insertar en la pila:");
        int elementoPila = scanner.nextInt();
        pila.push(elementoPila);
    }

    private static void mostrarPila(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("Contenido de la pila (LIFO):");
            for (int i = pila.size() - 1; i >= 0; i--) {
                System.out.println(pila.get(i));
            }
        }
    }

    private static void comprobarPilaVacia(Stack<Integer> pila) {
        System.out.println("La pila " + (pila.isEmpty() ? "está vacía." : "no está vacía."));
    }

    private static void vaciarPila(Stack<Integer> pila) {
        pila.clear();
        System.out.println("La pila ha sido vaciada.");
    }

    private static void insertarEnCola(Queue<Integer> cola, Scanner scanner) {
        System.out.println("Ingrese un número para insertar en la cola:");
        int elementoCola = scanner.nextInt();
        cola.add(elementoCola);
    }

    private static void mostrarCola(Queue<Integer> cola) {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía");
        } else {
            System.out.println("Contenido de la cola (FIFO):");
            for (int elemento : cola) {
                System.out.println(elemento);
            }
        }
    }

    private static void comprobarColaVacia(Queue<Integer> cola) {
        System.out.println("La cola " + (cola.isEmpty() ? "está vacía." : "no está vacía."));
    }

    private static void vaciarCola(Queue<Integer> cola) {
        cola.clear();
        System.out.println("La cola ha sido vaciada.");
    }
}