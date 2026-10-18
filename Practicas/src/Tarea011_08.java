/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_08 - Verificar si una Cadena Contiene una Secuencia de Caracteres
 * Descripcion: Comprobar si una cadena contiene una secuencia específica de caracteres utilizando el método contains().
 */
public class Tarea011_08 {
    public static void main(String[] args) {
        String cadena = "Ejercicios de Java y Programación";
        String secuencia = "Java";

        System.out.println("Cadena original: " + cadena);
        System.out.println("Secuencia especificada: " + secuencia);

        boolean contiene = cadena.contains(secuencia);
        System.out.println("¿La cadena contiene la secuencia-: " + contiene);
    }
}
