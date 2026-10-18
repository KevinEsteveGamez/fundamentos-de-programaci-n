/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_75 - Verificar si una Subcadena Aparece en el Medio Exacto
 * Descripcion: Determinar si la subcadena 'abc' aparece en el centro exacto de una cadena dada, con una diferencia de caracteres a izquierda y derecha no mayor a 1.
 */
public class Tarea011_75 {
    public static void main(String[] args) {
        String cadena1 = "xxabcxx";
        String cadena2 = "xxabcxxx";
        String cadena3 = "xabcxxxx";

        System.out.println(cadena1 + " -> " + abcEnElMedio(cadena1));
        System.out.println(cadena2 + " -> " + abcEnElMedio(cadena2));
        System.out.println(cadena3 + " -> " + abcEnElMedio(cadena3));
    }

    public static boolean abcEnElMedio(String s) {
        if (s.length() < 3) return false;
        int medio = s.length() / 2;
        if (s.length() % 2 == 0) {
            return s.substring(medio - 2, medio + 1).equals("abc") || s.substring(medio - 1, medio + 2).equals("abc");
        } else {
            return s.substring(medio - 1, medio + 2).equals("abc");
        }
    }
}
