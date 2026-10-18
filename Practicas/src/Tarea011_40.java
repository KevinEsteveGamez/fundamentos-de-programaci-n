/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_40 - Dividir una Cadena en N Partes Iguales
 * Descripcion: Segmentar una cadena de texto en N fragmentos de longitud exactamente igual.
 */
public class Tarea011_40 {
    public static void main(String[] args) {
        String texto = "abcdefghijklmnopqrstuvwxy";
        int n = 5;

        System.out.println("La cadena dada es: " + texto);
        System.out.println("La cadena dividida en " + n + " partes iguales es:");
        dividirEnPartesIguales(texto, n);
    }

    public static void dividirEnPartesIguales(String s, int n) {
        int longitud = s.length();
        if (longitud % n != 0) {
            System.out.println("La cadena no se puede dividir en " + n + " partes exactamente iguales.");
            return;
        }
        int tamParte = longitud / n;
        for (int i = 0; i < longitud; i += tamParte) {
            System.out.println(s.substring(i, i + tamParte));
        }
    }
}
