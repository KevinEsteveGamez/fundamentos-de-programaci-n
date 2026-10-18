/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_42 - Listar Elementos que Contienen Todas las Letras de una Palabra
 * Descripcion: Dada una lista de palabras, encontrar aquellas que contengan todos los caracteres presentes en una palabra patrÃ³n.
 */
public class Tarea011_42 {
    public static void main(String[] args) {
        String[] listaPalabras = { "rabbit", "bribed", "bark", "bramble", "boar" };
        String patron = "bar";

        System.out.println("El patrÃ³n buscado es: " + patron);
        System.out.println("Palabras que contienen todas las letras del patrÃ³n:");
        for (String palabra : listaPalabras) {
            if (contieneTodasLasLetras(palabra, patron)) {
                System.out.println(palabra);
            }
        }
    }

    public static boolean contieneTodasLasLetras(String palabra, String patron) {
        for (int i = 0; i < patron.length(); i++) {
            if (palabra.indexOf(patron.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
