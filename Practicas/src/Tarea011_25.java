/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_25 - Reemplazar Subcadenas con Expresiones Regulares
 * Descripcion: Reemplazar todas las apariciones que coincidan con una expresión regular o subcadena usando replaceAll().
 */
public class Tarea011_25 {
    public static void main(String[] args) {
        String cadenaOriginal = "The quick brown fox jumps over the lazy dog.";
        String cadenaModificada = cadenaOriginal.replaceAll("fox", "cat");

        System.out.println("Original:   " + cadenaOriginal);
        System.out.println("Modificada: " + cadenaModificada);
    }
}
