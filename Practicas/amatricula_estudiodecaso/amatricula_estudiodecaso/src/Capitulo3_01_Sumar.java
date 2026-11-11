/**
 * Proyecto: amatricula_estudiodecaso
 * Archivo: Capitulo3_01_Sumar.java
 * Referencia: Capitulo 3 - Figura 29 (Pagina 57)
 * Descripcion: Ejemplo de una funcion que realiza una accion y devuelve un resultado.
 */
public class Capitulo3_01_Sumar {

    /**
     * Funcion que suma dos numeros enteros y devuelve el resultado.
     * @param a Primer numero entero
     * @param b Segundo numero entero
     * @return La suma de a y b
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  CAPITULO 3 - FIGURA 29: FUNCION SUMAR");
        System.out.println("=================================================");

        int num1 = 15;
        int num2 = 25;
        int resultado = sumar(num1, num2);

        System.out.println("Primer numero: " + num1);
        System.out.println("Segundo numero: " + num2);
        System.out.println("Resultado de la suma: " + resultado);

        System.out.println("\nPrueba adicional:");
        System.out.println("sumar(100, 250) = " + sumar(100, 250));
        System.out.println("sumar(-5, 12)   = " + sumar(-5, 12));
    }
}
