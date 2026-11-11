/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_03_MostrarMenu.java
 * Referencia: Capitulo 3 - Seccion 3.3.1 (Paginas 64 y 66)
 * Descripcion: Funcion para formatear y concatenar un arreglo de opciones de menu.
 * Se incluyen las dos versiones del capitulo: con ciclo while clasico y con bucle for-each.
 */
public class Capitulo3_03_MostrarMenu {

    /**
     * Version con bucle while clasico (Pagina 64).
     * Itera usando un indice manual 'i' y numera las opciones dinamicamente.
     * @param opciones Arreglo con las opciones del menu
     * @return Cadena con el menu formateado
     */
    public static String MostrarMenuWhile(String[] opciones) {
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    /**
     * Version con bucle for-each mejorado (Pagina 66).
     * Recorre directamente cada elemento sin necesidad de gestionar contadores manuales.
     * @param opciones Arreglo con las opciones del menu
     * @return Cadena concatenada con cada opcion y salto de linea
     */
    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        for (String info : opciones) {
            cadena = cadena + info + "\n";
        }
        return cadena;
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.3.1: MOSTRAR MENU");
        System.out.println("=================================================\n");

        // Opciones del Menu Principal del proyecto
        String[] menuConNumeracion = {
            "1.- Productos",
            "2.- Punto de Venta",
            "3.- Inventario",
            "4.- Listado de Ventas",
            "5.- Salida"
        };

        String[] menuTextoSimple = {
            "Modificar Producto",
            "Listado de Productos",
            "Salida"
        };

        System.out.println("--- 1. Menu generado con bucle for-each mejorado ---");
        System.out.println(MostrarMenu(menuConNumeracion));

        System.out.println("--- 2. Menu generado con bucle while (con indice automatico) ---");
        System.out.println(MostrarMenuWhile(menuTextoSimple));
    }
}
