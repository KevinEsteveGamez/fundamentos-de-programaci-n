/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_36 - Verificar si una Cadena es un Entrelazado VÃ¡lido
 * Descripcion: Determinar si una tercera cadena estÃ¡ formada por el entrelazado perfecto de dos cadenas dadas respetando sus Ã³rdenes internos.
 */
public class Tarea011_36 {
    public static void main(String[] args) {
        String cadena1 = "MNO";
        String cadena2 = "PQR";
        String entrelazada = "PMNQOR";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);
        System.out.println("Cadena candidata: " + entrelazada);

        boolean esValido = esEntrelazado(cadena1, cadena2, entrelazada);
        System.out.println("Â¿La cadena dada es un entrelazado vÃ¡lido-: " + esValido);
    }

    public static boolean esEntrelazado(String c1, String c2, String c3) {
        if (c1.length() + c2.length() != c3.length()) return false;
        return verificar(c1, 0, c2, 0, c3, 0);
    }

    private static boolean verificar(String c1, int i, String c2, int j, String c3, int k) {
        if (k == c3.length()) return true;
        boolean coincide1 = (i < c1.length() && c1.charAt(i) == c3.charAt(k)) && verificar(c1, i + 1, c2, j, c3, k + 1);
        boolean coincide2 = (j < c2.length() && c2.charAt(j) == c3.charAt(k)) && verificar(c1, i, c2, j + 1, c3, k + 1);
        return coincide1 || coincide2;
    }
}
