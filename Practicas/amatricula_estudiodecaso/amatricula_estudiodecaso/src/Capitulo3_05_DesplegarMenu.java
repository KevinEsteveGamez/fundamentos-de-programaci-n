import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_05_DesplegarMenu.java
 * Referencia: Capitulo 3 - Seccion 3.4.2 (Pagina 71)
 * Descripcion: Funcion que presenta al usuario el titulo del menu, las opciones
 * formateadas y captura la eleccion ingresada por el usuario.
 */
public class Capitulo3_05_DesplegarMenu {

    /**
     * Funcion auxiliar para mostrar opciones (Pagina 66).
     */
    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        for (String info : opciones) {
            cadena = cadena + info + "\n";
        }
        return cadena;
    }

    /**
     * Funcion auxiliar para solicitar datos por teclado (Pagina 68).
     */
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.print(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        cadena = lectura.readLine();
        return cadena;
    }

    /**
     * Despliega un menu completo y retorna la seleccion del usuario (Pagina 71).
     * @param Titulo1 Titulo encabezado del menu
     * @param menu Arreglo con las opciones
     * @return Opcion seleccionada por el usuario
     * @throws IOException Si ocurre un error de entrada/salida
     */
    public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException {
        String cadena;
        cadena = Titulo1 + "\n\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        return cadena = Dialogo(cadena);
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.4.2: DESPLEGAR MENU");
        System.out.println("=================================================\n");

        String titulo = "Menu de Punto de Tienda de Abarrotes la Pequena";
        String[] opciones = {
            "1.- Productos",
            "2.- Punto de Venta",
            "3.- Inventario",
            "4.- Listado de Ventas",
            "5.- Salida"
        };

        try {
            String seleccion = DesplegarMenu(titulo, opciones);
            System.out.println("\nSeleccionaste la opcion: " + seleccion);
        } catch (IOException e) {
            System.out.println("Error al desplegar el menu: " + e.getMessage());
        }
    }
}
