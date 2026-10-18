/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_57 - Intercambiar los Dos ï¿½sltimos Caracteres
 * Descripcion: Crear una nueva cadena intercambiando de posiciÃ³n los Ãºltimos dos caracteres de una cadena dada.
 */
public class Tarea011_57 {
    public static void main(String[] args) {
        String texto = "string";
        System.out.println("Cadena original: " + texto);

        String resultado = intercambiarUltimosDos(texto);
        System.out.println("Cadena con Ãºltimos dos caracteres intercambiados: " + resultado);
    }

    public static String intercambiarUltimosDos(String s) {
        int n = s.length();
        if (n < 2) return s;
        return s.substring(0, n - 2) + s.charAt(n - 1) + s.charAt(n - 2);
    }
}
