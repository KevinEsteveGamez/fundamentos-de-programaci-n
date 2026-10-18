/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_98 - Verificar si el Primer Carácter se Repite en su Siguiente Ocurrencia
 * Descripcion: Comprobar si el carácter ubicado en el índice 0 de una cadena vuelve a aparecer en la segunda posición (índice 1).
 */
public class Tarea011_98 {
    public static void main(String[] args) {
        String cadena1 = "ooonline";
        String cadena2 = "online";

        System.out.println(cadena1 + " -> " + primerCaracterRepetidoAlInicio(cadena1));
        System.out.println(cadena2 + " -> " + primerCaracterRepetidoAlInicio(cadena2));
    }

    public static boolean primerCaracterRepetidoAlInicio(String s) {
        if (s.length() < 2) return false;
        return s.charAt(0) == s.charAt(1);
    }
}
