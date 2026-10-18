import java.util.*;

/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_47 - Reorganizar Cadena con Distancia MÃ­nima entre Caracteres Iguales
 * Descripcion: Reordenar los caracteres de una cadena de forma que no existan caracteres idÃ©nticos a una distancia menor a D.
 */

public class Tarea011_47 {
    public static void main(String[] args) {
        String texto = "accessories";
        int distancia = 2;
        System.out.println("Cadena original: " + texto + ", Distancia requerida: " + distancia);

        String resultado = reorganizarConDistancia(texto, distancia);
        System.out.println("Cadena reorganizada: " + resultado);
    }

    public static String reorganizarConDistancia(String s, int d) {
        int n = s.length();
        int[] frecuencias = new int[256];
        for (int i = 0; i < n; i++) frecuencias[s.charAt(i)]++;

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 256; i++) {
            if (frecuencias[i] > 0) maxHeap.offer(new int[] { i, frecuencias[i] });
        }

        char[] resultado = new char[n];
        Queue<int[]> espera = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!espera.isEmpty() && i - espera.peek()[2] >= d) {
                maxHeap.offer(espera.poll());
            }
            if (maxHeap.isEmpty()) return "No es posible reorganizar";
            int[] actual = maxHeap.poll();
            resultado[i] = (char) actual[0];
            actual[1]--;
            if (actual[1] > 0) {
                espera.offer(new int[] { actual[0], actual[1], i });
            }
        }
        return new String(resultado);
    }
}
