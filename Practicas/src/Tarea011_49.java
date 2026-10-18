import java.util.*;

/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_49 - Primer CarÃ¡cter No Repetido en un Flujo de Datos
 * Descripcion: Determinar el primer carÃ¡cter no repetido conforme se procesa dinÃ¡micamente un flujo continuo de caracteres.
 */

public class Tarea011_49 {
    public static void main(String[] args) {
        String flujo = "godisgood";
        System.out.println("Procesando flujo de caracteres: " + flujo);

        int[] frecuencias = new int[256];
        Queue<Character> cola = new LinkedList<>();

        for (int i = 0; i < flujo.length(); i++) {
            char c = flujo.charAt(i);
            frecuencias[c]++;
            cola.add(c);

            while (!cola.isEmpty() && frecuencias[cola.peek()] > 1) {
                cola.remove();
            }

            if (cola.isEmpty()) {
                System.out.println("Paso " + (i + 1) + " ('" + c + "'): Ninguno");
            } else {
                System.out.println("Paso " + (i + 1) + " ('" + c + "'): Primer no repetido -> " + cola.peek());
            }
        }
    }
}
