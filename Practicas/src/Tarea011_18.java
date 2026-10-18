/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_18 - Generar Código Hash de una Cadena
 * Descripcion: Calcular y mostrar el identificador numérico hash de una cadena con el método hashCode().
 */
public class Tarea011_18 {
    public static void main(String[] args) {
        String cadena = "Ejercicios de Java";
        int codigoHash = cadena.hashCode();
        System.out.println("El código hash de \"" + cadena + "\" es: " + codigoHash);
    }
}
