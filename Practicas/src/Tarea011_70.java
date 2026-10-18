/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_70 - Comprobar Balance de Caracteres PQ
 * Descripcion: Verificar si en una cadena dada toda letra 'p' se encuentra inmediatamente equilibrada por una letra 'q'.
 */
public class Tarea011_70 {
    public static void main(String[] args) {
        String cadena1 = "gqpqp";
        String cadena2 = "gqppq";
        String cadena3 = "p";

        System.out.println(cadena1 + " -> " + balancePQ(cadena1));
        System.out.println(cadena2 + " -> " + balancePQ(cadena2));
        System.out.println(cadena3 + " -> " + balancePQ(cadena3));
    }

    public static boolean balancePQ(String s) {
        boolean balance = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                boolean tieneQ = false;
                if (i > 0 && s.charAt(i - 1) == 'q') tieneQ = true;
                if (i < s.length() - 1 && s.charAt(i + 1) == 'q') tieneQ = true;
                if (!tieneQ) balance = false;
            }
        }
        return balance;
    }
}
