/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_20 - Obtener la Representación Canónica de una Cadena
 * Descripcion: Demostrar el uso del método intern() para compartir referencias en el pool de cadenas de Java.
 */
public class Tarea011_20 {
    public static void main(String[] args) {
        String cadena1 = "Java";
        String cadena2 = new String("Java");
        String cadena3 = cadena2.intern();

        System.out.println("cadena1 == cadena2- " + (cadena1 == cadena2));
        System.out.println("cadena1 == cadena3 (tras intern())- " + (cadena1 == cadena3));
    }
}
