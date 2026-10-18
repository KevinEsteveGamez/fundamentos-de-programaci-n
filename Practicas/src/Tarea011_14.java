/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_14 - Comprobar Igualdad de Cadenas Ignorando Mayúsculas
 * Descripcion: Verificar si dos cadenas son iguales independientemente de mayúsculas y minúsculas con equalsIgnoreCase().
 */
public class Tarea011_14 {
    public static void main(String[] args) {
        String autor1 = "Stephen Edwin King";
        String autor2 = "stephen edwin king";
        String autor3 = "Walter Winchell";

        System.out.println("\"" + autor1 + "\" equalsIgnoreCase \"" + autor2 + "\"- " + autor1.equalsIgnoreCase(autor2));
        System.out.println("\"" + autor1 + "\" equalsIgnoreCase \"" + autor3 + "\"- " + autor1.equalsIgnoreCase(autor3));
    }
}
