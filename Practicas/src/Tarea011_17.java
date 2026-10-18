/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_17 - Copiar Caracteres de una Cadena a un Arreglo de Caracteres
 * Descripcion: Extraer un rango de caracteres de una cadena y copiarlos dentro de un arreglo char[] usando getChars().
 */
public class Tarea011_17 {
    public static void main(String[] args) {
        String cadena = "Este es un texto de prueba.";
        char[] destino = new char[11];
        cadena.getChars(5, 16, destino, 0);

        System.out.print("Caracteres copiados: ");
        System.out.println(destino);
    }
}
