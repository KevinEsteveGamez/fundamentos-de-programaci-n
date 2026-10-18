/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_87 - Comprobar si una Letra es Feliz (Aparece Contigua a Otra Igual)
 * Descripcion: Verificar si cada apariciÃ³n de la letra 'g' en una cadena estÃ¡ acompaÃ±ada inmediatamente por otra 'g' a su izquierda o derecha.
 */
public class Tarea011_87 {
    public static void main(String[] args) {
        String cadena1 = "happygg";
        String cadena2 = "gfg";

        System.out.println(cadena1 + " -> " + sonGFelices(cadena1));
        System.out.println(cadena2 + " -> " + sonGFelices(cadena2));
    }

    public static boolean sonGFelices(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                boolean feliz = false;
                if (i > 0 && s.charAt(i - 1) == 'g') feliz = true;
                if (i < s.length() - 1 && s.charAt(i + 1) == 'g') feliz = true;
                if (!feliz) return false;
            }
        }
        return true;
    }
}
