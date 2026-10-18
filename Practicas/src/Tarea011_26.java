/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_26 - Verificar si una Cadena Comienza con una Subcadena
 * Descripcion: Comprobar si una cadena inicia con un prefijo determinado mediante startsWith().
 */
public class Tarea011_26 {
    public static void main(String[] args) {
        String cadena1 = "Red is my favorite color.";
        String cadena2 = "Orange is also an interesting color.";
        String prefijo = "Red";

        System.out.println("\"" + cadena1 + "\" comienza con \"" + prefijo + "\"- " + cadena1.startsWith(prefijo));
        System.out.println("\"" + cadena2 + "\" comienza con \"" + prefijo + "\"- " + cadena2.startsWith(prefijo));
    }
}
