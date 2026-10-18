/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_59 - Verificar si Comienza con el Nombre de un Color ('red' o 'blue')
 * Descripcion: Retornar 'red' si la cadena comienza con 'red', 'blue' si comienza con 'blue', o cadena vacÃ­a si no cumple.
 */
public class Tarea011_59 {
    public static void main(String[] args) {
        String cadena1 = "redcap";
        String cadena2 = "blueSky";
        String cadena3 = "whiteShirt";

        System.out.println(cadena1 + " -> " + colorInicio(cadena1));
        System.out.println(cadena2 + " -> " + colorInicio(cadena2));
        System.out.println(cadena3 + " -> [" + colorInicio(cadena3) + "]");
    }

    public static String colorInicio(String s) {
        if (s.startsWith("red")) return "red";
        if (s.startsWith("blue")) return "blue";
        return "";
    }
}
