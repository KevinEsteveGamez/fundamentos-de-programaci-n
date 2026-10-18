/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_27 - Extraer Subcadena por Posición de Inicio y Fin
 * Descripcion: Obtener una porción de una cadena delimitada por índices de inicio y fin usando substring().
 */
public class Tarea011_27 {
    public static void main(String[] args) {
        String cadenaOriginal = "The quick brown fox jumps over the lazy dog.";
        String subcadena = cadenaOriginal.substring(10, 26);

        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Nueva subcadena: " + subcadena);
    }
}
