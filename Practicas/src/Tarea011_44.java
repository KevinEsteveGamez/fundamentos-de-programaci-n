/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_44 - Invertir una Cadena de Manera Recursiva
 * Descripcion: Invertir completamente una cadena de caracteres implementando una funciÃ³n recursiva pura.
 */
public class Tarea011_44 {
    public static void main(String[] args) {
        String texto = "The quick brown fox";
        System.out.println("La cadena original es: " + texto);

        String invertida = invertirRecursivamente(texto);
        System.out.println("La cadena invertida es: " + invertida);
    }

    public static String invertirRecursivamente(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return invertirRecursivamente(s.substring(1)) + s.charAt(0);
    }
}
