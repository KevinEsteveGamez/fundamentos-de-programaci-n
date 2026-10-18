/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_48 - Eliminar 'b' y 'ac' de una Cadena de Texto
 * Descripcion: Eliminar de forma recursiva o en una sola pasada todas las apariciones de la letra 'b' y la secuencia 'ac'.
 */
public class Tarea011_48 {
    public static void main(String[] args) {
        String texto = "abacaba";
        System.out.println("Cadena original: " + texto);

        String resultado = eliminarByAC(texto);
        System.out.println("Cadena resultante tras eliminar 'b' y 'ac': " + resultado);
    }

    public static String eliminarByAC(String s) {
        String actual = s.replace("b", "");
        while (actual.contains("ac")) {
            actual = actual.replace("ac", "");
        }
        return actual;
    }
}
