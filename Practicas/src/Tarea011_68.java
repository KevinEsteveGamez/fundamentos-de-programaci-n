/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_68 - Remover Caracteres EspecÃ­ficos y sus Vecinos Adyacentes
 * Descripcion: Eliminar de una cadena un carÃ¡cter comodÃ­n (por ejemplo '#') junto con el carÃ¡cter inmediatamente anterior y el posterior.
 */
public class Tarea011_68 {
    public static void main(String[] args) {
        String texto = "test#string";
        System.out.println("Cadena original: " + texto);

        String resultado = removerSimboloYVecinos(texto, '#');
        System.out.println("Resultado: " + resultado);
    }

    public static String removerSimboloYVecinos(String s, char simbolo) {
        int n = s.length();
        boolean[] ignorar = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == simbolo) {
                ignorar[i] = true;
                if (i > 0) ignorar[i - 1] = true;
                if (i < n - 1) ignorar[i + 1] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (!ignorar[i]) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
