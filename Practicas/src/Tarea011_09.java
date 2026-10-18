/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_09 - Comparar Cadena con una Secuencia de Caracteres (CharSequence)
 * Descripcion: Comparar el contenido de una cadena con un objeto CharSequence utilizando contentEquals().
 */
public class Tarea011_09 {
    public static void main(String[] args) {
        String cadena1 = "ejemplo.com";
        String cadena2 = "ejemplo.com";
        CharSequence secuencia = "Ejemplo.com";

        System.out.println("Comparando \"" + cadena1 + "\" y \"" + cadena2 + "\": " + cadena1.contentEquals(cadena2));
        System.out.println("Comparando \"" + cadena1 + "\" y \"" + secuencia + "\": " + cadena1.contentEquals(secuencia));
    }
}
