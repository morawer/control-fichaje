import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {

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
                    System.out.println(consultarUltimo(fichajes));
                    break;

                case 4:
                    mostrarHistorial();
                    break;

                case 5:
                    borrarFichajes();
                    break;
            }
        } while (opc != 6);
        sc.close();
    }

    // Función para borrar el archivo fichajes.txt.
    private static void borrarFichajes() {
        File archivo = new File("fichajes.txt");

        if (!archivo.exists()) {
            System.out.println("El fichero no existe");
        }
        archivo.delete();
    }

    // Función para mostrar el historial de fichajes.
    private static void mostrarHistorial() throws FileNotFoundException {
        File archivo = new File("fichajes.txt");

        if (!archivo.exists()) {
            System.out.println("El fichero no existe");
        }

        Scanner lector = new Scanner(archivo);
        while (lector.hasNext()) {
            String linea = lector.nextLine();
            System.out.println(linea);
        }
        lector.close();
    }

    /*
     * Función para consultar el último fichaje. Para ello, se imprime por pantalla
     * el último dato del ArrayList.
     */
    private static String consultarUltimo(ArrayList<Fichaje> fichajes) {
        int ultimo = fichajes.size() - 1;
        return fichajes.get(ultimo).toString();
    }

    /*
     * Función para el registro de fichajes. Cada registro es añadido a una
     * ArrayList para luego escribirse fichaje tras fichaje al archivo de texto
     * fichajes.txt.
     */
    private static void registro(ArrayList<Fichaje> fichajes, Scanner sc) {

        System.out.println("Nombre: ");
        String nombre = sc.next();

        System.out.println("Apellidos: ");
        String apellidos = sc.next();

        System.out.println("Tipo: ");
        String tipo = menuTipo(sc);

        System.out.println("Código: ");
        int codigo = sc.nextInt();

        Fichaje fich = new Fichaje(tipo, nombre, apellidos, codigo);
        fichajes.add(fich);

        try {
            FileWriter archivo = new FileWriter("fichajes.txt", true);
            archivo.write(consultarUltimo(fichajes));
            archivo.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Función para poder elegir el tipo de fichaje.
    private static String menuTipo(Scanner sc) {
        String tipo = " ";
        int opcTipo;
        do {
            System.out.println("1. Normal entrada.");
            System.out.println("2. Normal salida.");
            System.out.println("3. Horas Extra entrada.");
            System.out.println("4. Horas Extra salida.");
            System.out.println("5. Bolsa horaria positiva entrada.");
            System.out.println("6. Bolsa horaria positiva salida.");
            System.out.println("Elige una opción:");
            opcTipo = sc.nextInt();

            switch (opcTipo) {
                case 1:
                    tipo = "Normal entrada.";
                    break;
                case 2:
                    tipo = "Normal salida.";
                    break;
                case 3:
                    tipo = "Extra entrada.";
                    break;
                case 4:
                    tipo = "Extra salida.";
                    break;
                case 5:
                    tipo = "Bolsa horaria + entrada.";
                    break;
                case 6:
                    tipo = "Bolsa horaria + salida";
                    break;
            }
        } while (opcTipo == 0 || opcTipo > 6);
        return tipo;
    }

    // Función menú.
    private static void menu() {
        System.out.println("***************FICHAJE****************");
        System.out.println("1. Registrar entrada.");
        System.out.println("2. Registrar salida.");
        System.out.println("3. Consultar último fichaje.");
        System.out.println("4. Mostrar historial de fichajes.");
        System.out.println("5. Borrar historial.");
        System.out.println("6. Salir.");

    }

}