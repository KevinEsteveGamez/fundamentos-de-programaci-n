/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_13 - Comprobar Igualdad de Contenido entre Dos Cadenas
 * Descripcion: Verificar si dos objetos String contienen exactamente los mismos caracteres mediante equals().
 */
public class Tarea011_13 {
    public static void main(String[] args) {
        String autor1 = "Stephen Edwin King";
        String autor2 = "Walter Winchell";
        String autor3 = "Stephen Edwin King";

        System.out.println("\"" + autor1 + "\" equals \"" + autor2 + "\"- " + autor1.equals(autor2));
        System.out.println("\"" + autor1 + "\" equals \"" + autor3 + "\"- " + autor1.equals(autor3));
    }
}
