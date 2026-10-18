/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_45 - Invertir el Orden de las Palabras en una Cadena
 * Descripcion: Invertir el orden de las palabras contenidas en una frase, manteniendo intactas las letras de cada palabra.
 */
public class Tarea011_45 {
    public static void main(String[] args) {
        String texto = "Reverse words in a given string";
        System.out.println("La cadena original es: " + texto);

        String[] palabras = texto.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = palabras.length - 1; i >= 0; i--) {
            sb.append(palabras[i]);
            if (i > 0) sb.append(" ");
        }

        System.out.println("La cadena con palabras invertidas es: " + sb.toString());
    }
}
