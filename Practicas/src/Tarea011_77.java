/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_77 - Repetir una Palabra N Veces con un Separador
 * Descripcion: Construir una cadena repitiendo una palabra dada N veces, intercalando una cadena separadora entre cada repeticiÃ³n.
 */
public class Tarea011_77 {
    public static void main(String[] args) {
        String palabra = "Word";
        String separador = "X";
        int n = 3;

        System.out.println("Palabra: " + palabra + ", Separador: " + separador + ", n = " + n);
        String resultado = repetirConSeparador(palabra, separador, n);
        System.out.println("Resultado: " + resultado);
    }

    public static String repetirConSeparador(String palabra, String separador, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(palabra);
            if (i < n - 1) sb.append(separador);
        }
        return sb.toString();
    }
}
