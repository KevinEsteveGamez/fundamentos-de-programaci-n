/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_38 - Eliminar Caracteres Duplicados de una Cadena
 * Descripcion: Construir una nueva cadena conservando Ãºnicamente la primera apariciÃ³n de cada carÃ¡cter de la cadena original.
 */
public class Tarea011_38 {
    public static void main(String[] args) {
        String texto = "w3resource";
        System.out.println("Cadena original: " + texto);

        String sinDuplicados = eliminarDuplicados(texto);
        System.out.println("Cadena tras eliminar duplicados: " + sinDuplicados);
    }

    public static String eliminarDuplicados(String s) {
        boolean[] visto = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!visto[c]) {
                visto[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
