package listasdobles;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();

       
        lista.add(3);
        lista.add(7);
        lista.add(9);
        lista.add(12);
        lista.add(15);

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
                    if (iAdd >= 0 && iAdd <= lista.size()) {
                        lista.add(iAdd, val);
                        System.out.println("elemento anadido correctamente.");
                    } else {
                        System.out.println("indice fuera de rango.");
                    }
                    break;

                case 2:
                    System.out.print("ingresa el indice: ");
                    int iDel = sc.nextInt();
                    if (iDel >= 0 && iDel < lista.size()) {
                        lista.remove(iDel);
                        System.out.println("elemento eliminado correctamente.");
                    } else {
                        System.out.println("indice fuera de rango.");
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
