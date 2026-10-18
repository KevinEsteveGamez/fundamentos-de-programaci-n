/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_53 - Coincidencia de Cadenas con Comodines ('*' y '-')
 * Descripcion: Evaluar si una cadena coincide con un patrÃ³n que puede contener los comodines '-' (un carÃ¡cter) y '*' (cero o mÃ¡s caracteres).
 */
public class Tarea011_53 {
    public static void main(String[] args) {
        String texto = "abcdhgh";
        String patron = "a*d-g*";

        System.out.println("Texto: " + texto);
        System.out.println("PatrÃ³n con comodines: " + patron);

        boolean coincide = coincideComodines(texto, patron);
        System.out.println("Â¿El texto coincide con el patrÃ³n-: " + coincide);
    }

    public static boolean coincideComodines(String texto, String patron) {
        int m = texto.length(), n = patron.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int j = 1; j <= n; j++) {
            if (patron.charAt(j - 1) == '*') dp[0][j] = dp[0][j - 1];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (patron.charAt(j - 1) == '-' || patron.charAt(j - 1) == texto.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (patron.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}
