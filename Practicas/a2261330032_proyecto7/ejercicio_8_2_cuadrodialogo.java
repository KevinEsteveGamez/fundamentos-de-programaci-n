import javax.swing.JOptionPane;

public class ejercicio_8_2_cuadrodialogo {
    public static void main(String args[]) {
        double l1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 1:"));
        double l2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 2:"));
        double l3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 3:"));

        if (l1 == l2 && l2 == l3) {
            JOptionPane.showMessageDialog(null, "Triangulo Equilatero");
        }
        if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1)) {
            JOptionPane.showMessageDialog(null, "Triangulo Isosceles");
        }
        if (l1 != l2 && l1 != l3 && l2 != l3) {
            JOptionPane.showMessageDialog(null, "Triangulo Escaleno");
        }
    }
}