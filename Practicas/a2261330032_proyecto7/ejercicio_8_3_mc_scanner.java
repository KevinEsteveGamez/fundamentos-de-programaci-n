import java.util.Scanner;

public class ejercicio_8_3_mc_scanner {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el lado 1:");
        double l1 = entrada.nextDouble();
        System.out.println("Introduce el lado 2:");
        double l2 = entrada.nextDouble();
        System.out.println("Introduce el lado 3:");
        double l3 = entrada.nextDouble();

        if (l1 == l2) {
            if (l2 == l3) {
                System.out.println("Triangulo Equilatero");
            } else {
                System.out.println("Triangulo Isosceles");
            }
        } else {
            if (l1 == l3 || l2 == l3) {
                System.out.println("Triangulo Isosceles");
            } else {
                System.out.println("Triangulo Escaleno");
            }
        }
    }
}