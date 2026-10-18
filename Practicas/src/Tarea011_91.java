/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_91 - Contar Palabras que Terminan en 'm' o 'n'
 * Descripcion: Contar la cantidad de palabras en una cadena de texto que finalizan con la letra 'm' o 'n'.
 */
public class Tarea011_91 {
    public static void main(String[] args) {
        String texto = "mam man mom run sun cat dog";
        System.out.println("Texto analizado: " + texto);

        int total = contarPalabrasQueTerminanEnMyN(texto);
        System.out.println("Palabras que terminan en 'm' o 'n': " + total);
    }

    public static int contarPalabrasQueTerminanEnMyN(String s) {
        String[] palabras = s.toLowerCase().split("\\s+");
        int contador = 0;
        for (String p : palabras) {
            if (p.endsWith("m") || p.endsWith("n")) {
                contador++;
            }
        }
        return contador;
    }
}
