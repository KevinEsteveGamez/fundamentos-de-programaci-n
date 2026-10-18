/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_90 - Comparar la Cantidad de Dos Subcadenas Distintas
 * Descripcion: Verificar si dos subcadenas especÃ­ficas aparecen exactamente la misma cantidad de veces dentro de una cadena.
 */
public class Tarea011_90 {
    public static void main(String[] args) {
        String texto = "thecatandthedogandthecat";
        String s1 = "cat";
        String s2 = "dog";

        System.out.println("Cadena: " + texto);
        boolean resultado = tienenMismoConteo(texto, s1, s2);
        System.out.println("Â¿Aparecen \"" + s1 + "\" y \"" + s2 + "\" la misma cantidad de veces-: " + resultado);
    }

    public static boolean tienenMismoConteo(String s, String sub1, String sub2) {
        int c1 = 0, c2 = 0;
        int idx = 0;
        while ((idx = s.indexOf(sub1, idx)) != -1) { c1++; idx += sub1.length(); }
        idx = 0;
        while ((idx = s.indexOf(sub2, idx)) != -1) { c2++; idx += sub2.length(); }
        return c1 == c2;
    }
}
