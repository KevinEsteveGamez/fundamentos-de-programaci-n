/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_61 - Subcadena Formada por los Primeros N y ï¿½sltimos N Caracteres
 * Descripcion: Construir una nueva cadena uniendo los primeros n caracteres y los Ãºltimos n caracteres de una cadena dada.
 */
public class Tarea011_61 {
    public static void main(String[] args) {
        String texto = "Welcome";
        int n = 3;

        System.out.println("Cadena original: " + texto + ", n = " + n);
        String resultado = primerosYUltimosN(texto, n);
        System.out.println("Resultado: " + resultado);
    }

    public static String primerosYUltimosN(String s, int n) {
        if (s.length() < n) return s;
        return s.substring(0, n) + s.substring(s.length() - n);
    }
}
