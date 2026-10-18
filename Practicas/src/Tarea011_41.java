/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_41 - Eliminar Caracteres Usando una Cadena MÃ¡scara
 * Descripcion: Eliminar de una cadena principal todos aquellos caracteres que se encuentren en una segunda cadena mÃ¡scara.
 */
public class Tarea011_41 {
    public static void main(String[] args) {
        String texto = "the quick brown fox";
        String mascara = "queen";

        System.out.println("La cadena original es: " + texto);
        System.out.println("La mÃ¡scara es: " + mascara);

        String filtrada = eliminarConMascara(texto, mascara);
        System.out.println("La nueva cadena es: " + filtrada);
    }

    public static String eliminarConMascara(String s, String m) {
        boolean[] mascaraBool = new boolean[256];
        for (int i = 0; i < m.length(); i++) {
            mascaraBool[m.charAt(i)] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!mascaraBool[c]) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
