/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_92 - Eliminar Todas las Instancias de una Subcadena
 * Descripcion: Remover todas las apariciones de una subcadena objetivo dentro de un texto dado.
 */
public class Tarea011_92 {
    public static void main(String[] args) {
        String texto = "This is the test string";
        String aEliminar = "is";

        System.out.println("Original:   " + texto);
        String resultado = texto.replace(aEliminar, "");
        System.out.println("Resultado:  " + resultado);
    }
}
