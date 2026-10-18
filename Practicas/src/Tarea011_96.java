/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_96 - Remover un Carácter Excepto en la Primera y �sltima Posición
 * Descripcion: Eliminar todas las apariciones de un carácter específico dentro de una cadena excepto si se ubica en los extremos (índice 0 o final).
 */
public class Tarea011_96 {
    public static void main(String[] args) {
        String texto = "xxzedxxe";
        char objetivo = 'x';

        System.out.println("Original: " + texto + ", eliminar: '" + objetivo + "'");
        String resultado = removerExceptoExtremos(texto, objetivo);
        System.out.println("Resultado: " + resultado);
    }

    public static String removerExceptoExtremos(String s, char c) {
        if (s.length() <= 2) return s;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) != c) {
                sb.append(s.charAt(i));
            }
        }
        sb.append(s.charAt(s.length() - 1));
        return sb.toString();
    }
}
