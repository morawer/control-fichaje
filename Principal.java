import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opc = 0;
        ArrayList<Fichaje> fichajes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        do {

            menu();

            System.out.println("Elige una opción: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    registro(fichajes, sc);
                    break;

                case 2:

            }

        } while (opc != 5);

        sc.close();

    }

    private static void registro(ArrayList<Fichaje> fichajes, Scanner sc) {
        System.out.println("Nombre: ");
        String nombre = sc.next();

        System.out.println("Apellidos: ");
        String apellidos = sc.next();

        System.out.println("Tipo: ");
        String tipo = sc.next();

        System.out.println("Código: ");
        int codigo = sc.nextInt();

        Fichaje fich = new Fichaje(tipo, nombre, apellidos, codigo);
        fichajes.add(fich);
    }

    private static void menu() {
        System.out.println("************FICHAJE*************");
        System.out.println("1. Registrar entrada.");
        System.out.println("2. Registrar salida.");
        System.out.println("3. Consultar último fichaje.");
        System.out.println("4. Guardar fichajes.");
        System.out.println("5. Salir.");
    }

}