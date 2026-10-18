/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_02 - Obtener Punto de Código Unicode en un Índice
 * Descripcion: Desarrollar un programa en Java que obtenga el valor numérico Unicode (punto de código) de un carácter en un índice dado de una cadena.
 */
public class Tarea011_02 {
    public static void main(String[] args) {
        String cadena = "w3resource.com";
        System.out.println("Cadena original: " + cadena);

        // Obtener el punto de código Unicode en las posiciones 1 y 9
        int codigoPunto1 = cadena.codePointAt(1);
        int codigoPunto2 = cadena.codePointAt(9);

        System.out.println("Carácter (punto Unicode en índice 1) = " + codigoPunto1);
        System.out.println("Carácter (punto Unicode en índice 9) = " + codigoPunto2);
    }
}
