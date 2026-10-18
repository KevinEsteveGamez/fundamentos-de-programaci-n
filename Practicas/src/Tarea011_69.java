/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_69 - Extraer Subcadena Entre Dos Ocurrencias de una Palabra
 * Descripcion: Obtener el texto ubicado entre la primera y la Ãºltima apariciÃ³n de una palabra clave (ej. 'toast' o 'bread').
 */
public class Tarea011_69 {
    public static void main(String[] args) {
        String texto = "breadjambread";
        String delimitador = "bread";

        System.out.println("Cadena original: " + texto);
        String resultado = extraerEntreDelimitadores(texto, delimitador);
        System.out.println("Contenido entre \"" + delimitador + "\": " + resultado);
    }

    public static String extraerEntreDelimitadores(String s, String delim) {
        int primero = s.indexOf(delim);
        int ultimo = s.lastIndexOf(delim);

        if (primero != -1 && ultimo != -1 && primero != ultimo) {
            return s.substring(primero + delim.length(), ultimo);
        }
        return "";
    }
}
