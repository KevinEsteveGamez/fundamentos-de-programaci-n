/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_99 - Extraer Caracteres en Índices Pares Solamente
 * Descripcion: Construir una nueva cadena seleccionando únicamente los caracteres situados en posiciones de índice par (0, 2, 4, ...).
 */
public class Tarea011_99 {
    public static void main(String[] args) {
        String texto = "w3resource.com";
        System.out.println("Cadena original: " + texto);

        String pares = extraerIndicesPares(texto);
        System.out.println("Caracteres en índices pares: " + pares);
    }

    public static String extraerIndicesPares(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
