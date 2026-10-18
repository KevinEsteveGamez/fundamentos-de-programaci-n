/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_06 - Comparación Lexicográfica Ignorando Mayúsculas y Minúsculas
 * Descripcion: Comparar dos cadenas de texto lexicográficamente sin distinguir entre mayúsculas y minúsculas.
 */
public class Tarea011_06 {
    public static void main(String[] args) {
        String cadena1 = "este es el ejercicio 1";
        String cadena2 = "Este es el Ejercicio 1";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        int resultado = cadena1.compareToIgnoreCase(cadena2);

        if (resultado < 0) {
            System.out.println("\"" + cadena1 + "\" es menor que \"" + cadena2 + "\" (ignorando mayúsculas)");
        } else if (resultado == 0) {
            System.out.println("\"" + cadena1 + "\" es igual a \"" + cadena2 + "\" (ignorando mayúsculas)");
        } else {
            System.out.println("\"" + cadena1 + "\" es mayor que \"" + cadena2 + "\" (ignorando mayúsculas)");
        }
    }
}
