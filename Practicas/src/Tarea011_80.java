/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_80 - Verificar si un CarÃ¡cter estÃ¡ Rodeado por Caracteres Iguales
 * Descripcion: Comprobar si en una cadena existe un carÃ¡cter especÃ­fico rodeado inmediatamente por el mismo carÃ¡cter a izquierda y derecha.
 */
public class Tarea011_80 {
    public static void main(String[] args) {
        String texto = "moon#night";
        char objetivo = '#';

        System.out.println("Cadena: " + texto + ", objetivo: '" + objetivo + "'");
        boolean resultado = estaRodeadoPorIguales(texto, objetivo);
        System.out.println("Â¿El carÃ¡cter estÃ¡ rodeado por caracteres idÃ©nticos-: " + resultado);
    }

    public static boolean estaRodeadoPorIguales(String s, char c) {
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == c) {
                if (s.charAt(i - 1) == s.charAt(i + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
