/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_51 - Contar y Mostrar Caracteres Duplicados
 * Descripcion: Identificar e imprimir todos los caracteres duplicados de una cadena junto con su frecuencia de apariciÃ³n.
 */
public class Tarea011_51 {
    public static void main(String[] args) {
        String texto = "w3resource";
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Los caracteres duplicados son:");

        int[] conteo = new int[256];
        for (int i = 0; i < texto.length(); i++) {
            conteo[texto.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (conteo[i] > 1) {
                System.out.println("CarÃ¡cter '" + (char) i + "' aparece " + conteo[i] + " veces.");
            }
        }
    }
}
