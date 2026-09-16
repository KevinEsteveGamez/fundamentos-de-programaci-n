package a2261330032_practica8;
import javax.swing.JOptionPane;

public class ejercicio05_dialogo {
    public static void main(String[] args) {
        String producto1 = "coca cola light lata 400 ml", producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0, precio2 = 15.0;
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Menu de Opciones\n1.- Productos\n2.- Punto de venta\nQue opcion deseas:"));
        
        switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null, "El " + producto1 + " cuesta " + precio1 + "\nEl " + producto2 + " cuesta " + precio2);
                break;
            case 2:
                int cant1 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad comprada de " + producto1 + ":"));
                int cant2 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad comprada de " + producto2 + ":"));
                
                double subtotal1 = cant1 * precio1;
                double iva1 = subtotal1 * 0.16;
                double total1 = subtotal1 + iva1;
                
                double subtotal2 = cant2 * precio2;
                double iva2 = subtotal2 * 0.16;
                double total2 = subtotal2 + iva2;
                
                String mensaje = cant1 + " " + producto1 + " (Total: " + total1 + ")\n";
                mensaje += cant2 + " " + producto2 + " (Total: " + total2 + ")\n\n";
                mensaje += "Gran Total Venta:\nSubtotal: " + (subtotal1 + subtotal2) + "\nIVA: " + (iva1 + iva2) + "\nTotal: " + (total1 + total2);
                
                JOptionPane.showMessageDialog(null, mensaje);
                break;
            default:
                JOptionPane.showMessageDialog(null, "eleccion incorrecta");
                break;
        }
    }
}