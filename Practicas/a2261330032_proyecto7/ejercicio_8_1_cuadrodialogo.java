
import javax.swing.JOptionPane;

public class ejercicio_8_1_cuadrodialogo {
    public static void main(String args[]) {
        double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tarifa base del servicio:"));
        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de cliente (1:Normal, 2:Profesor, 3:Alumno):"));
        
        double subtotal = tarifa;
        if (tipo == 2) {
            subtotal = tarifa - (tarifa * 0.20);
        } else if (tipo == 3) {
            subtotal = tarifa - (tarifa * 0.10);
        }
        
        double total = subtotal * 1.16;
        JOptionPane.showMessageDialog(null, "El total a pagar con IVA es: $" + total);
    }
}