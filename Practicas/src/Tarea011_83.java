/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_83 - Alternar Caracteres de Dos Cadenas
 * Descripcion: Combinar dos cadenas intercalando un carÃ¡cter de la primera y uno de la segunda sucesivamente.
 */
public class Tarea011_83 {
    public static void main(String[] args) {
        String cadena1 = "welcome";
        String cadena2 = "w3resource";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        String resultado = alternarCadenas(cadena1, cadena2);
        System.out.println("Resultado intercalado: " + resultado);
    }

    public static String alternarCadenas(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(s1.length(), s2.length());
        for (int i = 0; i < maxLen; i++) {
            if (i < s1.length()) sb.append(s1.charAt(i));
            if (i < s2.length()) sb.append(s2.charAt(i));
        }
        return sb.toString();
    }
}
