/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_86 - Contar TrÃ­os de Caracteres IdÃ©nticos Consecutivos
 * Descripcion: Contar cuÃ¡ntas veces aparece una secuencia de tres caracteres exactamente iguales de forma consecutiva.
 */
public class Tarea011_86 {
    public static void main(String[] args) {
        String texto = "wellcommmmeee";
        System.out.println("Cadena original: " + texto);

        int trios = contarTrios(texto);
        System.out.println("Cantidad de trÃ­os de caracteres consecutivos: " + trios);
    }

    public static int contarTrios(String s) {
        int contador = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                contador++;
            }
        }
        return contador;
    }
}
