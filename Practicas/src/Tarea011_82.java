/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_82 - Duplicar Cada CarÃ¡cter de una Cadena
 * Descripcion: Crear una nueva cadena en la que cada carÃ¡cter de la cadena original aparezca duplicado dos veces consecutivas.
 */
public class Tarea011_82 {
    public static void main(String[] args) {
        String texto = "The";
        System.out.println("Cadena original: " + texto);

        String duplicada = duplicarCaracteres(texto);
        System.out.println("Cadena con caracteres duplicados: " + duplicada);
    }

    public static String duplicarCaracteres(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sb.append(c).append(c);
        }
        return sb.toString();
    }
}
