/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_54 - Ventana MÃ­nima que Contiene Todos los Caracteres
 * Descripcion: Hallar la subcadena continua mÃ¡s pequeÃ±a de una cadena que contenga todos los caracteres de otra cadena objetivo.
 */
public class Tarea011_54 {
    public static void main(String[] args) {
        String fuente = "welcome to w3resource";
        String objetivo = "tower";

        System.out.println("Cadena original: " + fuente);
        System.out.println("Caracteres requeridos: " + objetivo);

        String ventana = ventanaMinima(fuente, objetivo);
        System.out.println("La ventana mÃ¡s pequeÃ±a que contiene todos los caracteres es: " + ventana);
    }

    public static String ventanaMinima(String s, String t) {
        int[] mapa = new int[256];
        for (char c : t.toCharArray()) mapa[c]++;

        int inicio = 0, fin = 0, inicioMin = 0, minLen = Integer.MAX_VALUE, contador = t.length();

        while (fin < s.length()) {
            if (mapa[s.charAt(fin++)]-- > 0) contador--;
            while (contador == 0) {
                if (fin - inicio < minLen) {
                    minLen = fin - inicio;
                    inicioMin = inicio;
                }
                if (mapa[s.charAt(inicio++)]++ == 0) contador++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(inicioMin, inicioMin + minLen);
    }
}
