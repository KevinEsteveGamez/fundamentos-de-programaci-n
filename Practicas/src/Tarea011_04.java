/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_04 - Contar Puntos de Código Unicode en un Rango
 * Descripcion: Contar la cantidad de puntos de código Unicode presentes en un rango específico de una cadena de texto.
 */
public class Tarea011_04 {
    public static void main(String[] args) {
        String cadena = "w3resource.com";
        System.out.println("Cadena original: " + cadena);

        // Contar puntos de código entre el índice 1 y el índice 10
        int totalPuntos = cadena.codePointCount(1, 10);
        System.out.println("Cantidad de puntos de código en el rango [1, 10) = " + totalPuntos);
    }
}
