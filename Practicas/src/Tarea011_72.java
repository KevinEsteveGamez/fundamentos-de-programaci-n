/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_72 - Verificar PatrÃ³n P-P en una Cadena
 * Descripcion: Comprobar si en una cadena existe un patrÃ³n donde la letra 'p' aparezca dos veces separada por exactamente un carÃ¡cter arbitrario.
 */
public class Tarea011_72 {
    public static void main(String[] args) {
        String cadena1 = "popxyz";
        String cadena2 = "apbxyz";
        String cadena3 = "xyz";

        System.out.println(cadena1 + " -> " + tienePatronP_P(cadena1));
        System.out.println(cadena2 + " -> " + tienePatronP_P(cadena2));
        System.out.println(cadena3 + " -> " + tienePatronP_P(cadena3));
    }

    public static boolean tienePatronP_P(String s) {
        for (int i = 0; i <= s.length() - 3; i++) {
            if (s.charAt(i) == 'p' && s.charAt(i + 2) == 'p') {
                return true;
            }
        }
        return false;
    }
}
