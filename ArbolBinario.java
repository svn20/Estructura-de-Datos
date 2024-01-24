/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolbinario;

/**
 *
 * @author Alexa Espinoza y Salvador Laguna
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

class Nodo {
    int valor;
    Nodo izquierda, derecha;

    public Nodo(int item) {
        valor = item;
        izquierda = derecha = null;
    }
}

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    void insertar(int valor) { // Corregir - insertar todo de una //
        raiz = insertarRecursivo(raiz, valor);
    }

    Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        }

        return nodo;
    }

    void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecha);
        }
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String opcionStr = JOptionPane.showInputDialog("Menu:\n" +
                    "1. Agregar nodo\n" +
                    "2. Mostrar el bonito recorrido inOrden\n" +
                    "3. Salir");

            if (opcionStr == null) {
                // Se cerró la ventana de JOptionPane, el usuario eligió salir.
                System.out.println("Saliendo del programa.");
                break;
            }
        try {
                int opcion = Integer.parseInt(opcionStr);

                switch (opcion) {
                    case 1:
                        String valorStr = JOptionPane.showInputDialog("Ingrese el valor del nodo:");
                        int valor = Integer.parseInt(valorStr);
                        arbol.insertar(valor);
                        break;
                    case 2:
                        System.out.println("Recorrido inOrden:");
                        arbol.inOrden(arbol.raiz);
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
    }
}
}
