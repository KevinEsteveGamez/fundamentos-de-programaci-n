/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_16 - Obtener Arreglo de Bytes de una Cadena
 * Descripcion: Convertir el contenido de una cadena de texto en un arreglo de bytes utilizando getBytes().
 */
public class Tarea011_16 {
    public static void main(String[] args) {
        String cadena = "Este es un texto de ejemplo.";
        byte[] arregloBytes = cadena.getBytes();
        String nuevaCadena = new String(arregloBytes);

        System.out.println("La nueva cadena reconstruida desde bytes es: " + nuevaCadena);
    }
}
