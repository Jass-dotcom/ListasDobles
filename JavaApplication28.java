package javaapplication28;

import java.util.*;

public class JavaApplication28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> lista = new LinkedList<>();

        
        lista.add("Las Aguas");
        lista.add("Museo del Oro");
        lista.add("Av Jimenez");
        lista.add("San Victorino");
        lista.add("Tercer Milenio");
        
        int op; 
        

        do {
            System.out.println("\n------------ selecciona la accion ------------");
            System.out.println("1. añadir en un indice especifico");
            System.out.println("2. eliminar en un indice especifico");
            System.out.println("3. imprimir lista en reversa");
            System.out.println("4. imprimir lista normal");
            System.out.println("9. salir");
            System.out.println("---------------------------------------------");
            System.out.print("> ");
            op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.print("ingresa el indice: ");
                    int iAdd = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ingresa el nombre: ");
                    String valor = sc.nextLine();
                    if (iAdd >= 0 && iAdd <= lista.size()) {
                        lista.add(iAdd, valor);
                        System.out.println("elemento anadido correctamente.");
                    } else {
                        System.out.println("indice invalido.");
                    }
                    break;

                case 2:
                    System.out.print("ingresa el indice: ");
                    int iDel = sc.nextInt();
                    if (iDel >= 0 && iDel < lista.size()) {
                        lista.remove(iDel);
                        System.out.println("elemento eliminado correctamente.");
                    } else {
                        System.out.println("indice invalido.");
                    }
                    break;

                case 3:
                    System.out.println("\nlista en reversa:");
                    for (int i = lista.size() - 1; i >= 0; i--) {
                        System.out.print(lista.get(i));
                        if (i > 0) System.out.print(" <-> ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\nlista normal:");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.print(lista.get(i));
                        if (i < lista.size() - 1) System.out.print(" <-> ");
                    }
                    System.out.println();
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


