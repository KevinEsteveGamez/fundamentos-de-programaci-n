/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_88 - Reemplazar la Palabra 'is' por 'is not'
 * Descripcion: Sustituir cada apariciÃ³n de la palabra independiente 'is' por 'is not', sin modificar palabras compuestas como 'this' o 'island'.
 */
public class Tarea011_88 {
    public static void main(String[] args) {
        String texto = "it is a string";
        System.out.println("Original:  " + texto);

        String resultado = texto.replaceAll("\\bis\\b", "is not");
        System.out.println("Resultado: " + resultado);
    }
}
