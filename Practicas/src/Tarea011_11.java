/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_11 - Crear un Objeto String desde un Arreglo de Caracteres
 * Descripcion: Construir una nueva cadena a partir de un arreglo de caracteres (char[]) o un subrango del mismo.
 */
public class Tarea011_11 {
    public static void main(String[] args) {
        char[] arregloCaracteres = new char[] { 'E', 'l', ' ', 'l', 'i', 'b', 'r', 'o', ' ', 'c', 'o', 'n', 't', 'i', 'e', 'n', 'e', ' ', '2', '3', '4', ' ', 'p', 'a', 'g', 'i', 'n', 'a', 's', '.' };
        String texto = String.copyValueOf(arregloCaracteres, 0, arregloCaracteres.length);
        System.out.println(texto);
    }
}
