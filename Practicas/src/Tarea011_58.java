/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_58 - Verificar si Termina con Dos Caracteres EspecÃ­ficos
 * Descripcion: Comprobar si los dos primeros caracteres de una cadena coinciden exactamente con los dos Ãºltimos.
 */
public class Tarea011_58 {
    public static void main(String[] args) {
        String texto = "educated";
        System.out.println("La cadena dada es: " + texto);

        boolean coincide = primerosDosIgualUltimosDos(texto);
        System.out.println("Â¿Los dos primeros caracteres aparecen al final-: " + coincide);
    }

    public static boolean primerosDosIgualUltimosDos(String s) {
        if (s.length() < 2) return false;
        String primerosDos = s.substring(0, 2);
        return s.endsWith(primerosDos);
    }
}
