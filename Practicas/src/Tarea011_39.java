/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_39 - Encontrar el Primer CarÃ¡cter No Repetido
 * Descripcion: Localizar el primer carÃ¡cter en la cadena que aparezca exactamente una sola vez.
 */
public class Tarea011_39 {
    public static void main(String[] args) {
        String texto = "gibblegabbler";
        System.out.println("La cadena dada es: " + texto);

        char resultado = primerNoRepetido(texto);
        if (resultado != '\0') {
            System.out.println("El primer carÃ¡cter no repetido en la cadena es: " + resultado);
        } else {
            System.out.println("No hay caracteres no repetidos.");
        }
    }

    public static char primerNoRepetido(String s) {
        int[] frecuencias = new int[256];
        for (int i = 0; i < s.length(); i++) {
            frecuencias[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (frecuencias[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return '\0';
    }
}
