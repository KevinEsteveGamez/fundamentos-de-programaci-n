/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_35 - Generar Permutaciones de una Cadena con RepeticiÃ³n
 * Descripcion: Generar e imprimir todas las permutaciones posibles de longitud N a partir de los caracteres dados permitiendo repeticiÃ³n.
 */
public class Tarea011_35 {
    public static void main(String[] args) {
        String texto = "PQR";
        System.out.println("La cadena dada es: " + texto);
        System.out.println("Las permutaciones con repeticiÃ³n son:");
        permutarConRepeticion("", texto, texto.length());
    }

    public static void permutarConRepeticion(String prefijo, String conjunto, int longitudRestante) {
        if (longitudRestante == 0) {
            System.out.println(prefijo);
            return;
        }
        for (int i = 0; i < conjunto.length(); i++) {
            permutarConRepeticion(prefijo + conjunto.charAt(i), conjunto, longitudRestante - 1);
        }
    }
}
