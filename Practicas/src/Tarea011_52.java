/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_52 - Comprobar si una Cadena es RotaciÃ³n de Otra
 * Descripcion: Determinar si una segunda cadena es una rotaciÃ³n cÃ­clica vÃ¡lida de una primera cadena.
 */
public class Tarea011_52 {
    public static void main(String[] args) {
        String cadena1 = "ABACD";
        String cadena2 = "CDABA";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        boolean rotacion = sonRotaciones(cadena1, cadena2);
        System.out.println("Â¿La cadena 2 es una rotaciÃ³n de la cadena 1-: " + rotacion);
    }

    public static boolean sonRotaciones(String s1, String s2) {
        return (s1.length() == s2.length()) && ((s1 + s1).contains(s2));
    }
}
