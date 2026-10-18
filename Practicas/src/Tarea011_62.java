/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_62 - Verificar si Contiene 'good' al Inicio
 * Descripcion: Determinar si la palabra 'good' aparece a partir del Ã­ndice 0 o del Ã­ndice 1 de una cadena.
 */
public class Tarea011_62 {
    public static void main(String[] args) {
        String cadena1 = "goodboy";
        String cadena2 = "ygoodboy";
        String cadena3 = "pizza";

        System.out.println(cadena1 + " -> " + tieneGoodAlInicio(cadena1));
        System.out.println(cadena2 + " -> " + tieneGoodAlInicio(cadena2));
        System.out.println(cadena3 + " -> " + tieneGoodAlInicio(cadena3));
    }

    public static boolean tieneGoodAlInicio(String s) {
        if (s.length() < 4) return false;
        if (s.startsWith("good")) return true;
        if (s.length() >= 5 && s.substring(1).startsWith("good")) return true;
        return false;
    }
}
