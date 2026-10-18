/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_29 - Convertir Cadena a Letras Minúsculas
 * Descripcion: Transformar todos los caracteres alfabéticos de una cadena a minúsculas usando toLowerCase().
 */
public class Tarea011_29 {
    public static void main(String[] args) {
        String cadenaOriginal = "The Quick BroWn FoX Jumps Over The Lazy Dog.";
        String cadenaMinusculas = cadenaOriginal.toLowerCase();

        System.out.println("Original:   " + cadenaOriginal);
        System.out.println("Minúsculas: " + cadenaMinusculas);
    }
}
