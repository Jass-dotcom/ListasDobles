package nodo;
import java.util.*;

class Node {
    int dato;
    Node next;
    Node prev;
    Node(int d) {
        dato = d;
    }
}

class Lista {
    Node head;

    void anadir(int index, int dato) {
        Node nuevo = new Node(dato);
        if (index == 0) {
            nuevo.next = head;
            if (head != null) head.prev = nuevo;
            head = nuevo;
            return;
        }
        Node temp = head;
        int c = 0;
        while (temp != null && c < index - 1) {
            temp = temp.next;
            c++;
        }
        if (temp == null) {
            System.out.println("indice invalido");
            return;
        }
        nuevo.next = temp.next;
        if (temp.next != null) temp.next.prev = nuevo;
        temp.next = nuevo;
        nuevo.prev = temp;
    }

    void eliminarindice(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        Node temp = head;
        int c = 0;
        while (temp != null && c < index) {
            temp = temp.next;
            c++;
        }
        if (temp == null) {
            System.out.println("indice invalido");
            return;
        }
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    void printNormal() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.dato);
            if (temp.next != null) System.out.print(" <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    void printReversa() {
        Node temp = head;
        if (temp == null) return;
        while (temp.next != null) temp = temp.next;
        while (temp != null) {
            System.out.print(temp.dato);
            if (temp.prev != null) System.out.print(" <-> ");
            temp = temp.prev;
        }
        System.out.println();
    }
}

public class ListaEnlazada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();

        
        lista.anadir(0, 3);
        lista.anadir(1, 7);
        lista.anadir(2, 9);
        lista.anadir(3, 12);
        lista.anadir(4, 15);

        int op;

        do {
            System.out.println("\n------------ selecciona la accion ------------");
            System.out.println("1. anadir en un indice especifico");
            System.out.println("2. eliminar en un indice especifico");
            System.out.println("3. imprimir lista en reversa");
            System.out.println("4. imprimir lista normal");
            System.out.println("9. salir");
            System.out.println("nota: el indice inicia desde 0");
            System.out.print("> ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("ingresa el indice: ");
                    int iAdd = sc.nextInt();
                    System.out.print("ingresa el valor: ");
                    int val = sc.nextInt();
                    lista.anadir(iAdd, val);
                    break;

                case 2:
                    System.out.print("ingresa el indice: ");
                    int iDel = sc.nextInt();
                    lista.eliminarindice(iDel);
                    break;

                case 3:
                    System.out.println("\nlista en reversa:");
                    lista.printReversa();
                    break;

                case 4:
                    System.out.println("\nlista normal:");
                    lista.printNormal();
                    break;

                case 9:
                    System.out.println("saliendo del programa...");
                    break;

                default:
                    System.out.println("opcion no valida, intenta nuevamente.");
                    break;
            }

        } while (op != 9);

        sc.close();
    }
}
