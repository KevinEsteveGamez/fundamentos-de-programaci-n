/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_94 - Subcadena Espejo Más Larga al Inicio y al Final
 * Descripcion: Hallar la subcadena inicial más larga que coincida con el reverso de la subcadena final.
 */
public class Tarea011_94 {
    public static void main(String[] args) {
        String texto = "abXXba";
        System.out.println("Cadena original: " + texto);

        String resultado = subcadenaEspejo(texto);
        System.out.println("Subcadena espejo más larga: " + resultado);
    }

    public static String subcadenaEspejo(String s) {
        int n = s.length();
        int longitud = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt(n - 1 - i)) {
                longitud++;
            } else {
                break;
            }
        }
        return s.substring(0, longitud);
    }
}
