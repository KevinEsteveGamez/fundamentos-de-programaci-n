/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_19 - Obtener el Índice de Cada Letra del Alfabeto en una Cadena
 * Descripcion: Determinar la primera posición en la que aparece cada letra del abecedario ('a' a 'z') dentro de una cadena.
 */
public class Tarea011_19 {
    public static void main(String[] args) {
        String cadena = "El veloz murciélago hindú comía feliz cardillo y kiwi.";
        System.out.println("Cadena analizada: " + cadena);
        System.out.println("Índices de cada letra del alfabeto ('a'-'z'):");

        String enMinusculas = cadena.toLowerCase();
        for (char letra = 'a'; letra <= 'z'; letra++) {
            int posicion = enMinusculas.indexOf(letra);
            System.out.print(letra + ":" + posicion + " ");
        }
        System.out.println();
    }
}
