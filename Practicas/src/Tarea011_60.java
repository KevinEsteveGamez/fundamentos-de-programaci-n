/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_60 - Concatenar Cadenas Igualando sus Longitudes
 * Descripcion: Concatenar dos cadenas asegurando que tengan igual longitud, recortando caracteres sobrantes del inicio de la mÃ¡s larga.
 */
public class Tarea011_60 {
    public static void main(String[] args) {
        String cadena1 = "Welcome";
        String cadena2 = "home";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        String resultado = concatenarLongitudIgual(cadena1, cadena2);
        System.out.println("Resultado: " + resultado);
    }

    public static String concatenarLongitudIgual(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());
        String parte1 = s1.substring(s1.length() - minLen);
        String parte2 = s2.substring(s2.length() - minLen);
        return parte1 + parte2;
    }
}
