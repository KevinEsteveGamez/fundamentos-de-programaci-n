import java.util.Arrays;

/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_37 - Subcadena MÃ¡s Larga sin Caracteres Repetidos
 * Descripcion: Hallar la longitud y el contenido de la subcadena continua mÃ¡s extensa que no posea ningÃºn carÃ¡cter repetido.
 */

public class Tarea011_37 {
    public static void main(String[] args) {
        String texto = "pickoutthelongestsubstring";
        System.out.println("Cadena original: " + texto);

        int longitudMax = subcadenaSinRepetidos(texto);
        System.out.println("Longitud de la subcadena mÃ¡s larga sin repetidos: " + longitudMax);
    }

    public static int subcadenaSinRepetidos(String s) {
        int[] ultimasPosiciones = new int[256];
        Arrays.fill(ultimasPosiciones, -1);
        int maxLen = 0, inicio = 0;

        for (int fin = 0; fin < s.length(); fin++) {
            char c = s.charAt(fin);
            if (ultimasPosiciones[c] >= inicio) {
                inicio = ultimasPosiciones[c] + 1;
            }
            ultimasPosiciones[c] = fin;
            maxLen = Math.max(maxLen, fin - inicio + 1);
        }
        return maxLen;
    }
}
