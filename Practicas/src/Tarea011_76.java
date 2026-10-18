/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_76 - Contar Subcadenas del PatrÃ³n 'li-e'
 * Descripcion: Contar cuÃ¡ntas veces aparece la palabra 'life' en una cadena, admitiendo cualquier letra en lugar de la 'f'.
 */
public class Tarea011_76 {
    public static void main(String[] args) {
        String texto = "liveonwildlife";
        System.out.println("Cadena original: " + texto);

        int total = contarPatronLife(texto);
        System.out.println("Cantidad de apariciones del patrÃ³n 'li-e': " + total);
    }

    public static int contarPatronLife(String s) {
        int contador = 0;
        for (int i = 0; i <= s.length() - 4; i++) {
            if (s.charAt(i) == 'l' && s.charAt(i + 1) == 'i' && s.charAt(i + 3) == 'e') {
                contador++;
            }
        }
        return contador;
    }
}
