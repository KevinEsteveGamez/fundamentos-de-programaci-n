/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_93 - Prefijo y Sufijo Común Más Largo en una Cadena
 * Descripcion: Encontrar la subcadena no vacía más extensa que aparezca tanto al inicio (prefijo) como al final (sufijo) sin solaparse obligatoriamente.
 */
public class Tarea011_93 {
    public static void main(String[] args) {
        String texto = "playersplay";
        System.out.println("Cadena: " + texto);

        String resultado = prefijoSufijoMasLargo(texto);
        System.out.println("Prefijo y sufijo común más largo: " + resultado);
    }

    public static String prefijoSufijoMasLargo(String s) {
        int n = s.length();
        for (int i = n - 1; i > 0; i--) {
            if (s.substring(0, i).equals(s.substring(n - i))) {
                return s.substring(0, i);
            }
        }
        return "";
    }
}
