import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException; 

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
                    registro(fichajes, sc);
                    break;

                case 3:
                    consultarUltimo(fichajes);

            }

        } while (opc != 5);

        sc.close();

    }

    private static void consultarUltimo(ArrayList<Fichaje> fichajes) {
        int ultimo = fichajes.size() - 1;
        System.out.println(fichajes.get(ultimo).toString());
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

        try {

            FileWriter archivo = new FileWriter ("fichajes.txt");
            archivo.write(fichajes.toString());
            archivo.close();

        }   catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
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