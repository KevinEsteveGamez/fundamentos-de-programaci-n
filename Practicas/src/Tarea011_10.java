/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_10 - Comparar Cadena con un StringBuffer
 * Descripcion: Comparar el contenido de un String con un StringBuffer utilizando contentEquals().
 */
public class Tarea011_10 {
    public static void main(String[] args) {
        String cadena = "ejemplo.com";
        StringBuffer bufer1 = new StringBuffer("ejemplo.com");
        StringBuffer bufer2 = new StringBuffer("Ejemplo.com");

        System.out.println("Comparando \"" + cadena + "\" y StringBuffer \"" + bufer1 + "\": " + cadena.contentEquals(bufer1));
        System.out.println("Comparando \"" + cadena + "\" y StringBuffer \"" + bufer2 + "\": " + cadena.contentEquals(bufer2));
    }
}
