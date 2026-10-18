/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_30 - Convertir Cadena a Letras Mayúsculas
 * Descripcion: Transformar todos los caracteres alfabéticos de una cadena a mayúsculas usando toUpperCase().
 */
public class Tarea011_30 {
    public static void main(String[] args) {
        String cadenaOriginal = "The Quick BroWn FoX Jumps Over The Lazy Dog.";
        String cadenaMayusculas = cadenaOriginal.toUpperCase();

        System.out.println("Original:   " + cadenaOriginal);
        System.out.println("Mayúsculas: " + cadenaMayusculas);
    }
}
