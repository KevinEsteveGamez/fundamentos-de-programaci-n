/**
 * Asignatura: Programacion en Java / Estructuras de Cadenas
 * Codigo: Tarea011_55 - Eliminar Duplicados Adyacentes de Forma Recursiva
 * Descripcion: Eliminar pares o grupos de caracteres idÃ©nticos contiguos de forma iterativa hasta que no queden duplicados adyacentes.
 */
public class Tarea011_55 {
    public static void main(String[] args) {
        String texto = "aabaarbarccrabmq";
        System.out.println("La cadena original es: " + texto);

        String resultado = eliminarAdyacentes(texto);
        System.out.println("Cadena tras eliminar duplicados adyacentes: " + resultado);
    }

    public static String eliminarAdyacentes(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        boolean huboCambio = false;

        while (i < n) {
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                huboCambio = true;
                while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
            } else {
                sb.append(s.charAt(i));
            }
            i++;
        }
        String res = sb.toString();
        if (huboCambio && res.length() != s.length()) {
            return eliminarAdyacentes(res);
        }
        return res;
    }
}
