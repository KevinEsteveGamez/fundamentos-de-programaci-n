/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_05 - Comparación Lexicográfica de Dos Cadenas
 * Descripcion: Comparar lexicográficamente dos cadenas de texto indicando si son iguales, menor o mayor.
 */
public class Tarea011_05 {
    public static void main(String[] args) {
        String cadena1 = "Este es el Ejercicio 1";
        String cadena2 = "Este es el Ejercicio 2";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        int diferencia = cadena1.compareTo(cadena2);

        if (diferencia < 0) {
            System.out.println("\"" + cadena1 + "\" es menor lexicográficamente que \"" + cadena2 + "\"");
        } else if (diferencia == 0) {
            System.out.println("\"" + cadena1 + "\" es igual a \"" + cadena2 + "\"");
        } else {
            System.out.println("\"" + cadena1 + "\" es mayor lexicográficamente que \"" + cadena2 + "\"");
        }
    }
}
