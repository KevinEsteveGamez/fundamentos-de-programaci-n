/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_10_RellenarEspacios.java
 * Referencia: Capitulo 3 - Seccion 3.6.1 (Paginas 82-85)
 * Descripcion: Funciones de formateo de texto para justificar cadenas rellenando con espacios
 * a la derecha para lograr una presentacion tabular limpia en la consola.
 * Incluye version manual con bucle (p. 83) y version nativa con String.format (p. 85).
 */
public class Capitulo3_10_RellenarEspacios {

    /**
     * Version algoritmica manual mediante bucle for (Pagina 83).
     * @param dato Cadena original
     * @param tamano Longitud deseada
     * @return Cadena rellena con espacios
     */
    public static String RellenarEspacios(String dato, int tamano) {
        String cadena;
        cadena = dato;
        for (int ciclo = dato.length() - 1; ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
    }

    /**
     * Version optimizada utilizando la funcion nativa String.format (Pagina 85).
     * El especificador "%1$-" justifica a la izquierda con el ancho especificado.
     * @param dato Cadena original
     * @param tamano Longitud deseada
     * @return Cadena formateada
     */
    public static String Rellenarespacios(String dato, int tamano) {
        return String.format("%1$-" + tamano + "s", dato);
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - SECCION 3.6.1: RELLENAR ESPACIOS");
        System.out.println("=================================================\n");

        System.out.println("Ejemplo de tabla de productos alineada con Rellenarespacios:");
        System.out.println("---------------------------------------------------------");
        System.out.println(Rellenarespacios("CODIGO", 10) + Rellenarespacios("PRODUCTO", 25) + Rellenarespacios("PRECIO", 10) + Rellenarespacios("CANTIDAD", 10));
        System.out.println("---------------------------------------------------------");
        System.out.println(Rellenarespacios("001", 10) + Rellenarespacios("Arroz 1kg", 25) + Rellenarespacios("35.00", 10) + Rellenarespacios("10", 10));
        System.out.println(Rellenarespacios("002", 10) + Rellenarespacios("Azucar 1kg", 25) + Rellenarespacios("25.00", 10) + Rellenarespacios("10", 10));
        System.out.println(Rellenarespacios("006", 10) + Rellenarespacios("Huevos 12 unidades", 25) + Rellenarespacios("45.00", 10) + Rellenarespacios("10", 10));
        System.out.println("---------------------------------------------------------");
    }
}
