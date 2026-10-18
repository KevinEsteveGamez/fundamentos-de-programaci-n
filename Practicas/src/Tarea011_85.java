/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_85 - Caracteres Alrededor de una Subcadena Dada
 * Descripcion: Extraer y concatenar todos los caracteres que aparecen inmediatamente antes y despuÃ©s de cada apariciÃ³n de una subcadena.
 */
public class Tarea011_85 {
    public static void main(String[] args) {
        String texto = "we1dispose1here";
        String busqueda = "1";

        System.out.println("Texto: " + texto + ", subcadena: " + busqueda);
        String resultado = caracteresAlrededor(texto, busqueda);
        System.out.println("Caracteres alrededor: " + resultado);
    }

    public static String caracteresAlrededor(String s, String sub) {
        StringBuilder sb = new StringBuilder();
        int subLen = sub.length();
        int idx = 0;
        while ((idx = s.indexOf(sub, idx)) != -1) {
            if (idx > 0) sb.append(s.charAt(idx - 1));
            if (idx + subLen < s.length()) sb.append(s.charAt(idx + subLen));
            idx += subLen;
        }
        return sb.toString();
    }
}
