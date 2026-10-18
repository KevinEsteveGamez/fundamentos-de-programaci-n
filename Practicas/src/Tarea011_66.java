/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_66 - Eliminar Primeros Dos Caracteres Excepto si son 'g' o 'h'
 * Descripcion: Crear una cadena omitiendo los dos primeros caracteres, a menos que el primer carÃ¡cter sea 'g' o el segundo sea 'h'.
 */
public class Tarea011_66 {
    public static void main(String[] args) {
        String cadena1 = "goat";
        String cadena2 = "photo";
        String cadena3 = "ghost";

        System.out.println(cadena1 + " -> " + filtrarPrimerosGH(cadena1));
        System.out.println(cadena2 + " -> " + filtrarPrimerosGH(cadena2));
        System.out.println(cadena3 + " -> " + filtrarPrimerosGH(cadena3));
    }

    public static String filtrarPrimerosGH(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() > 0 && s.charAt(0) == 'g') sb.append('g');
        if (s.length() > 1 && s.charAt(1) == 'h') sb.append('h');
        if (s.length() > 2) sb.append(s.substring(2));
        return sb.toString();
    }
}
