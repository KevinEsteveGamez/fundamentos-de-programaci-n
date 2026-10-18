/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_28 - Convertir Cadena a un Arreglo de Caracteres
 * Descripcion: Transformar una cadena completa en un arreglo unidimensional de caracteres char[] mediante toCharArray().
 */
public class Tarea011_28 {
    public static void main(String[] args) {
        String cadena = "Java Exercises.";
        char[] arregloCaracteres = cadena.toCharArray();

        System.out.println("Cadena original: " + cadena);
        System.out.print("Elementos del arreglo: ");
        for (char c : arregloCaracteres) {
            System.out.print("[" + c + "] ");
        }
        System.out.println();
    }
}
