import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_1_mc_buffer {
    public static void main(String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce la tarifa base del servicio:");
        double tarifa = Double.parseDouble(entrada.readLine());
        System.out.println("Tipo de cliente (1:Normal, 2:Profesor, 3:Alumno):");
        int tipo = Integer.parseInt(entrada.readLine());
        
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