/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_34 - Encontrar el Segundo CarÃ¡cter MÃ¡s Frecuente
 * Descripcion: Hallar el segundo carÃ¡cter que mÃ¡s veces se repite en una cadena de texto.
 */
public class Tarea011_34 {
    public static void main(String[] args) {
        String texto = "successes";
        System.out.println("La cadena dada es: " + texto);
        char resultado = segundoMasFrecuente(texto);
        if (resultado != '\0') {
            System.out.println("El segundo carÃ¡cter mÃ¡s frecuente en la cadena es: " + resultado);
        } else {
            System.out.println("No se encontrÃ³ un segundo carÃ¡cter mÃ¡s frecuente.");
        }
    }

    public static char segundoMasFrecuente(String texto) {
        int[] frecuencias = new int[256];
        for (int i = 0; i < texto.length(); i++) {
            frecuencias[texto.charAt(i)]++;
        }
        int primero = 0, segundo = 0;
        for (int i = 0; i < 256; i++) {
            if (frecuencias[i] > frecuencias[primero]) {
                segundo = primero;
                primero = i;
            } else if (frecuencias[i] > frecuencias[segundo] && frecuencias[i] != frecuencias[primero]) {
                segundo = i;
            }
        }
        return (char) segundo;
    }
}
