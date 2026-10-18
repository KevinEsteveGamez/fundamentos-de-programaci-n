/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_24 - Reemplazar Caracteres en una Cadena
 * Descripcion: Sustituir todas las apariciones de un carácter por otro dentro de una cadena usando replace().
 */
public class Tarea011_24 {
    public static void main(String[] args) {
        String cadenaOriginal = "El perro corre rápido por el sendero.";
        String cadenaModificada = cadenaOriginal.replace('r', 'x');

        System.out.println("Original:   " + cadenaOriginal);
        System.out.println("Modificada: " + cadenaModificada);
    }
}
