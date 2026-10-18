/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_78 - Repetir los ï¿½sltimos N Caracteres N Veces
 * Descripcion: Crear una cadena repitiendo los Ãºltimos n caracteres de una cadena original exactamente n veces.
 */
public class Tarea011_78 {
    public static void main(String[] args) {
        String texto = "w3resource";
        int n = 3;

        System.out.println("Cadena original: " + texto + ", n = " + n);
        String resultado = repetirUltimosN(texto, n);
        System.out.println("Resultado: " + resultado);
    }

    public static String repetirUltimosN(String s, int n) {
        String sufijo = s.substring(s.length() - n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(sufijo);
        }
        return sb.toString();
    }
}
