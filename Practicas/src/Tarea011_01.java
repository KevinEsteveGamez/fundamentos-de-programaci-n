/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_01 - Obtener Carácter en un Índice Específico
 * Descripcion: Escribir un programa en Java que obtenga y muestre el carácter ubicado en un índice determinado dentro de una cadena de texto.
 */
public class Tarea011_01 {
    public static void main(String[] args) {
        String cadena = "¡Ejercicios de Java!";
        System.out.println("Cadena original = " + cadena);

        // Obtener los caracteres en las posiciones 0 y 10
        char caracterPos0 = cadena.charAt(0);
        char caracterPos10 = cadena.charAt(10);

        // Mostrar resultados
        System.out.println("El carácter en la posición 0 es: " + caracterPos0);
        System.out.println("El carácter en la posición 10 es: " + caracterPos10);
    }
}
