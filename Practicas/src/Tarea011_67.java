/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_67 - Remover Caracteres Iniciales EspecÃ­ficos
 * Descripcion: Crear una nueva versiÃ³n de una cadena omitiendo el carÃ¡cter 'a' de la primera posiciÃ³n y 'b' de la segunda si existen.
 */
public class Tarea011_67 {
    public static void main(String[] args) {
        String cadena1 = "abcheck";
        String cadena2 = "acheck";
        String cadena3 = "bcheck";

        System.out.println(cadena1 + " -> " + removerABIniciales(cadena1));
        System.out.println(cadena2 + " -> " + removerABIniciales(cadena2));
        System.out.println(cadena3 + " -> " + removerABIniciales(cadena3));
    }

    public static String removerABIniciales(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == 'a') continue;
            if (i == 1 && s.charAt(i) == 'b') continue;
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
