/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_56 - Concatenar Cadenas sin Duplicar CarÃ¡cter en la UniÃ³n
 * Descripcion: Unir dos cadenas de texto asegurando que si el Ãºltimo carÃ¡cter de la primera es idÃ©ntico al primero de la segunda, se omita uno.
 */
public class Tarea011_56 {
    public static void main(String[] args) {
        String cadena1 = "food";
        String cadena2 = "door";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        String resultado = concatenarSinDoble(cadena1, cadena2);
        System.out.println("Resultado: " + resultado);
    }

    public static String concatenarSinDoble(String s1, String s2) {
        if (s1.isEmpty()) return s2;
        if (s2.isEmpty()) return s1;

        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1);
        }
        return s1 + s2;
    }
}
