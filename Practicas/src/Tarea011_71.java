/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_71 - Verificar si una Cadena estÃ¡ al Final de Otra (Sin Importar MayÃºsculas)
 * Descripcion: Comprobar si una de dos cadenas aparece al final exacto de la otra, ignorando diferencias de mayÃºsculas.
 */
public class Tarea011_71 {
    public static void main(String[] args) {
        String cadena1 = "pqrxyz";
        String cadena2 = "XYZ";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        boolean resultado = coincideAlFinal(cadena1, cadena2);
        System.out.println("Â¿Una cadena aparece al final de la otra-: " + resultado);
    }

    public static boolean coincideAlFinal(String s1, String s2) {
        String min1 = s1.toLowerCase();
        String min2 = s2.toLowerCase();
        return min1.endsWith(min2) || min2.endsWith(min1);
    }
}
