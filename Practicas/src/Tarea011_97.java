/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_97 - Extraer Caracteres en Bloques de 3 Saltando 2
 * Descripcion: Construir una cadena tomando bloques de 3 caracteres y saltando los siguientes 2 sucesivamente (índices 0-2, 5-7, 10-12, etc.).
 */
public class Tarea011_97 {
    public static void main(String[] args) {
        String texto = "w3resource.com";
        System.out.println("Cadena original: " + texto);

        String resultado = extraerBloquesTresSaltandoDos(texto);
        System.out.println("Resultado: " + resultado);
    }

    public static String extraerBloquesTresSaltandoDos(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i += 5) {
            int fin = Math.min(i + 3, n);
            sb.append(s.substring(i, fin));
        }
        return sb.toString();
    }
}
