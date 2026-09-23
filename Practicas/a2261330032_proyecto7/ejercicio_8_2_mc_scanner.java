import java.util.Scanner;

public class ejercicio_8_2_mc_scanner {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el lado 1:");
        double l1 = entrada.nextDouble();
        System.out.println("Introduce el lado 2:");
        double l2 = entrada.nextDouble();
        System.out.println("Introduce el lado 3:");
        double l3 = entrada.nextDouble();

        if (l1 == l2 && l2 == l3) {
            System.out.println("Triangulo Equilatero");
        }
        if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1)) {
            System.out.println("Triangulo Isosceles");
        }
        if (l1 != l2 && l1 != l3 && l2 != l3) {
            System.out.println("Triangulo Escaleno");
        }
    }
}