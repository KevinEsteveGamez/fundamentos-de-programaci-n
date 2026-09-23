import java.util.Scanner;

public class ejercicio_8_1_mc_scanner {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la tarifa base del servicio:");
        double tarifa = entrada.nextDouble();
        System.out.println("Tipo de cliente (1:Normal, 2:Profesor, 3:Alumno):");
        int tipo = entrada.nextInt();
        
        double subtotal = tarifa;
        if (tipo == 2) {
            subtotal = tarifa - (tarifa * 0.20);
        } else if (tipo == 3) {
            subtotal = tarifa - (tarifa * 0.10);
        }
        
        double total = subtotal * 1.16;
        System.out.println("El total a pagar con IVA es: $" + total);
    }
}