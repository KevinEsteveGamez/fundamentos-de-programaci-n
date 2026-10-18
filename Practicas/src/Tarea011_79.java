/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_79 - Remover CarÃ¡cter Intermedio en PatrÃ³n 'z-g'
 * Descripcion: Eliminar el carÃ¡cter intermedio en cualquier subcadena que comience con 'z' y termine con 'g' separadas por un carÃ¡cter.
 */
public class Tarea011_79 {
    public static void main(String[] args) {
        String texto = "zzgzzz";
        System.out.println("Cadena original: " + texto);

        String resultado = removerIntermedioZG(texto);
        System.out.println("Resultado: " + resultado);
    }

    public static String removerIntermedioZG(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && i < s.length() - 1 && s.charAt(i - 1) == 'z' && s.charAt(i + 1) == 'g') {
                continue; // Omitir el carÃ¡cter intermedio
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
