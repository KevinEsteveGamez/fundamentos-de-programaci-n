/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_32 - Encontrar la Subcadena PalindrÃ³mica MÃ¡s Larga
 * Descripcion: Determinar y retornar la subcadena palindrÃ³mica continua de mayor longitud dentro de un texto.
 */
public class Tarea011_32 {
    public static void main(String[] args) {
        String texto = "thequickbrownfoxxofnworbquickthe";
        System.out.println("Cadena original: " + texto);
        System.out.println("Subcadena palindrÃ³mica mÃ¡s larga: " + encontrarPalindromoMasLargo(texto));
    }

    public static String encontrarPalindromoMasLargo(String cadena) {
        if (cadena == null || cadena.length() < 1) return "";
        int inicio = 0, fin = 0;
        for (int i = 0; i < cadena.length(); i++) {
            int len1 = expandirAlrededorDelCentro(cadena, i, i);
            int len2 = expandirAlrededorDelCentro(cadena, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > fin - inicio) {
                inicio = i - (len - 1) / 2;
                fin = i + len / 2;
            }
        }
        return cadena.substring(inicio, fin + 1);
    }

    private static int expandirAlrededorDelCentro(String s, int izq, int der) {
        while (izq >= 0 && der < s.length() && s.charAt(izq) == s.charAt(der)) {
            izq--;
            der++;
        }
        return der - izq - 1;
    }
}
