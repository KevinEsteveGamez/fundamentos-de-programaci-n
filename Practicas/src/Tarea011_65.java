/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_65 - Eliminar Primer y ï¿½sltimo CarÃ¡cter si son Iguales
 * Descripcion: Remover el primer y el Ãºltimo carÃ¡cter de una cadena si y solo si ambos caracteres son exactamente idÃ©nticos.
 */
public class Tarea011_65 {
    public static void main(String[] args) {
        String cadena1 = "radar";
        String cadena2 = "computadora";

        System.out.println(cadena1 + " -> " + quitarExtremosIguales(cadena1));
        System.out.println(cadena2 + " -> " + quitarExtremosIguales(cadena2));
    }

    public static String quitarExtremosIguales(String s) {
        if (s.length() < 2) return s;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
