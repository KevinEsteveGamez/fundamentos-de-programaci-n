/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_46 - Invertir Cada Palabra Individualmente en una Cadena
 * Descripcion: Invertir las letras de cada palabra de una frase conservando las posiciones relativas de las palabras.
 */
public class Tarea011_46 {
    public static void main(String[] args) {
        String texto = "This is a test string";
        System.out.println("La cadena original es: " + texto);

        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            StringBuilder palabraInvertida = new StringBuilder(palabras[i]);
            resultado.append(palabraInvertida.reverse().toString());
            if (i < palabras.length - 1) resultado.append(" ");
        }

        System.out.println("Cada palabra invertida: " + resultado.toString());
    }
}
