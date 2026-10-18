/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_50 - Calcular el Rango LexicogrÃ¡fico de una Cadena
 * Descripcion: Hallar la posiciÃ³n o rango que ocuparÃ­a una cadena si todas sus permutaciones fueran ordenadas alfabÃ©ticamente.
 */
public class Tarea011_50 {
    public static void main(String[] args) {
        String texto = "BDCA";
        System.out.println("Cadena original: " + texto);

        long rango = calcularRangoLexicografico(texto);
        System.out.println("El rango lexicogrÃ¡fico es: " + rango);
    }

    public static long calcularRangoLexicografico(String s) {
        int n = s.length();
        long rango = 1;
        for (int i = 0; i < n; i++) {
            int menores = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) < s.charAt(i)) menores++;
            }
            rango += menores * factorial(n - 1 - i);
        }
        return rango;
    }

    private static long factorial(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
}
