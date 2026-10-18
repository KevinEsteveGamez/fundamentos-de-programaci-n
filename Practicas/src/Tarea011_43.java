/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_43 - Encontrar el CarÃ¡cter de MÃ¡xima Frecuencia
 * Descripcion: Determinar el carÃ¡cter que aparece el mayor nÃºmero de veces dentro de una cadena.
 */
public class Tarea011_43 {
    public static void main(String[] args) {
        String texto = "test string";
        System.out.println("La cadena dada es: " + texto);

        int[] frecuencias = new int[256];
        for (int i = 0; i < texto.length(); i++) {
            frecuencias[texto.charAt(i)]++;
        }

        int max = -1;
        char caracterMax = ' ';
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (frecuencias[c] > max) {
                max = frecuencias[c];
                caracterMax = c;
            }
        }

        System.out.println("El carÃ¡cter de mÃ¡xima frecuencia es '" + caracterMax + "' con " + max + " apariciones.");
    }
}
