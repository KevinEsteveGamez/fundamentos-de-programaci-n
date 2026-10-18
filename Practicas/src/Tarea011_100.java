/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_100 - Comprobar Presencia de una Subcadena en un Texto Extenso
 * Descripcion: Verificar si una subcadena específica existe dentro de una cadena de texto larga.
 */
public class Tarea011_100 {
    public static void main(String[] args) {
        String texto = "Java is the foundation for virtually every type of networked application.";
        String subcadena = "foundation";

        System.out.println("Texto: " + texto);
        System.out.println("Buscando: \"" + subcadena + "\"");

        boolean existe = texto.contains(subcadena);
        System.out.println("¿La subcadena está presente-: " + existe);
    }
}
