import java.util.ArrayList;
import java.util.Scanner;

public class MemoriaDinamica {

    private ArrayList<Integer> array = new ArrayList<>();

    public void agregarElemento(int elemento) {
        array.add(elemento);
        System.out.println("\n[+] Número agregado exitosamente.\n");
    }

    public void eliminarElemento(int posicion) {

        if (posicion >= 0 && posicion < array.size()) {
            array.remove(posicion);
            System.out.println("\n[-] Elemento eliminado exitosamente.\n");} 
            
        else {System.out.println("Posición inválida (No existe).");}
}

    public void mostrarElementos() {
        if(array.isEmpty()){System.out.println("\n[!] El arreglo esta vacio\n");}
        else {
        System.out.println("\n[=] Elementos en el arreglo:\n");
        for (int elemento : array) {System.out.print(elemento + " ");}
        System.out.println(); }
    }

    public void modificarElemento(int posicion, int nuevoElemento) {
        if (posicion >= 0 && posicion < array.size()) {
            array.set(posicion, nuevoElemento);
            System.out.println("\n[*] Elemento modificado exitosamente.\n");
        } 
        else {System.out.println("Posición inválida (No existe).");}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemoriaDinamica memoria = new MemoriaDinamica(); // Cambiado 'array' a 'memoria' para reflejar el objeto actual

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Modificar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un elemento: ");
                    int numero = scanner.nextInt();
                    memoria.agregarElemento(numero);
                    break;
                case 2:
                    System.out.print("Ingrese la posición del elemento a eliminar [0-" + (memoria.array.size() - 1) + "]: ");
                    int posicion = scanner.nextInt();
                    memoria.eliminarElemento(posicion);
                    break;
                case 3:
                    memoria.mostrarElementos();
                    break;
                case 4:
                    System.out.print("Ingrese la posición del elemento a modificar [0-" + (memoria.array.size() - 1) + "]: ");
                    int posModificar = scanner.nextInt();
                    System.out.print("Ingrese el nuevo elemento: ");
                    int nuevoElemento = scanner.nextInt();
                    memoria.modificarElemento(posModificar, nuevoElemento);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione otra.");
            }
        }
    }
}
