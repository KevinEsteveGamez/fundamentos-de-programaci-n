/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_64 - Eliminar Subcadena Duplicada al Inicio y al Final
 * Descripcion: Si una subcadena de longitud dada aparece tanto al inicio como al final de una cadena, extraer el contenido central.
 */
public class Tarea011_64 {
    public static void main(String[] args) {
        String texto = "HelloHe";
        int n = 2;

        System.out.println("Cadena original: " + texto + ", n = " + n);
        String resultado = quitarDuplicadoExtremos(texto, n);
        System.out.println("Resultado: " + resultado);
    }

    public static String quitarDuplicadoExtremos(String s, int n) {
        if (s.length() < n) return s;
        String prefijo = s.substring(0, n);
        String sufijo = s.substring(s.length() - n);
        if (prefijo.equals(sufijo)) {
            return s.substring(n);
        }
        return s;
    }
}
