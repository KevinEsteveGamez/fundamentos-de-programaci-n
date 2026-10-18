/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_84 - Prefijos Repetidos TruncÃ¡ndose Sucesivamente
 * Descripcion: Construir una cadena uniendo todos los prefijos posibles desde la longitud completa hasta 1.
 */
public class Tarea011_84 {
    public static void main(String[] args) {
        String texto = "Chocolate";
        System.out.println("Cadena original: " + texto);

        String resultado = prefijosDecrecientes(texto);
        System.out.println("Resultado: " + resultado);
    }

    public static String prefijosDecrecientes(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            sb.append(s.substring(0, i));
        }
        return sb.toString();
    }
}
