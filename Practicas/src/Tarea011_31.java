/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_31 - Eliminar Espacios en Blanco en los Extremos
 * Descripcion: Eliminar los espacios en blanco iniciales y finales de una cadena de texto usando trim().
 */
public class Tarea011_31 {
    public static void main(String[] args) {
        String cadenaOriginal = " Java Exercises ";
        String cadenaLimpia = cadenaOriginal.trim();

        System.out.println("Cadena original: [" + cadenaOriginal + "]");
        System.out.println("Cadena limpia:   [" + cadenaLimpia + "]");
    }
}
