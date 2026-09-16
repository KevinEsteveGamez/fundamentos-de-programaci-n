package a2261330032_practica8;
import javax.swing.JOptionPane;
public class ejercicio04_c {
    public static void main(String[] args) {
        double operando1 = Double.parseDouble(JOptionPane.showInputDialog("Operando 1:"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog("Operando 2:"));
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.- Suma\n2.- Mult\n3.- Div\nElige opcion:"));
        String cadena = "";
        switch (opcion) {
            case 1: cadena="Suma: " + (operando1+operando2); break;
            case 2: cadena="Multiplicacion: " + (operando1*operando2); break;
            case 3: cadena="Division: " + (operando1/operando2); break;
            default: cadena="Opcion no reconocida";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}