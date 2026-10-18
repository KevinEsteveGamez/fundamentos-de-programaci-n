/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_07 - Concatenar Dos Cadenas de Texto
 * Descripcion: Concatenar una cadena de texto al final de otra utilizando el método concat().
 */
public class Tarea011_07 {
    public static void main(String[] args) {
        String cadena1 = "Ejercicios de Java y ";
        String cadena2 = "Ejercicios de Python";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        String concatenada = cadena1.concat(cadena2);
        System.out.println("Cadena concatenada: " + concatenada);
    }
}
