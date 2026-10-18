/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_12 - Verificar si una Cadena Termina con una Subcadena
 * Descripcion: Determinar si una cadena finaliza con una secuencia de caracteres específica usando endsWith().
 */
public class Tarea011_12 {
    public static void main(String[] args) {
        String cadena1 = "Ejercicios de Python";
        String cadena2 = "Ejercicio de Python";
        String sufijo = "on";

        System.out.println("\"" + cadena1 + "\" termina con \"" + sufijo + "\"- " + cadena1.endsWith(sufijo));
        System.out.println("\"" + cadena2 + "\" termina con \"se\"- " + cadena2.endsWith("se"));
    }
}
