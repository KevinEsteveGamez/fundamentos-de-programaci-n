/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_03 - Obtener Punto de Código Unicode Anterior al Índice
 * Descripcion: Obtener el punto de código Unicode del carácter que precede a un índice específico en una cadena de texto.
 */
public class Tarea011_03 {
    public static void main(String[] args) {
        String cadena = "w3resource.com";
        System.out.println("Cadena original: " + cadena);

        // Obtener el punto de código Unicode anterior al índice dado
        int codigoPrevio1 = cadena.codePointBefore(1);
        int codigoPrevio2 = cadena.codePointBefore(9);

        System.out.println("Carácter (punto Unicode antes de índice 1) = " + codigoPrevio1);
        System.out.println("Carácter (punto Unicode antes de índice 9) = " + codigoPrevio2);
    }
}
