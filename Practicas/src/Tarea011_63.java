/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_63 - Comprobar si los Primeros Dos Caracteres Aparecen al Final
 * Descripcion: Verificar si la subcadena formada por los primeros 2 caracteres aparece tambiÃ©n al final de la cadena.
 */
public class Tarea011_63 {
    public static void main(String[] args) {
        String texto = "educated";
        System.out.println("Cadena original: " + texto);

        boolean resultado = primerosDosAlFinal(texto);
        System.out.println("Â¿Los dos primeros aparecen al final-: " + resultado);
    }

    public static boolean primerosDosAlFinal(String s) {
        if (s.length() < 2) return false;
        return s.endsWith(s.substring(0, 2));
    }
}
