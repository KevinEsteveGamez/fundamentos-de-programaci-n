/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_74 - Verificar si el Prefijo Aparece en Otra Parte de la Cadena
 * Descripcion: Determinar si el prefijo de longitud n aparece nuevamente en cualquier otra posiciÃ³n posterior de la cadena.
 */
public class Tarea011_74 {
    public static void main(String[] args) {
        String texto = "abXYabc";
        int n = 2;

        System.out.println("Cadena: " + texto + ", longitud prefijo: " + n);
        boolean aparece = prefijoApareceDespues(texto, n);
        System.out.println("Â¿El prefijo aparece nuevamente mÃ¡s adelante-: " + aparece);
    }

    public static boolean prefijoApareceDespues(String s, int n) {
        if (s.length() < n) return false;
        String prefijo = s.substring(0, n);
        return s.substring(n).contains(prefijo);
    }
}
