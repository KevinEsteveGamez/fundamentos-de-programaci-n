package a13_practica6;
import javax.swing.JOptionPane;

public class ejercicio05_JOptionPane {
    public static void main(String[] args) {
        int cant, sumacant = 0;
        String salida, resumen;
        double precio, subtotal, iva, total, sumaiva = 0, sumatotal = 0;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio del Refresco coca cola light lata:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada del Refresco coca cola light lata:"));
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        JOptionPane.showMessageDialog(null, salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = total + sumatotal;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio 1/4 de Arroz:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada del 1/4 de Arroz:"));
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        JOptionPane.showMessageDialog(null, salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = total + sumatotal;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio pieza de pan frances:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada piezas de pan frances:"));
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        JOptionPane.showMessageDialog(null, salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = total + sumatotal;

        resumen = "el total de productos vendidos fue " + sumacant + "\n"
                + "el total del iva fue " + sumaiva + "\n"
                + "el total " + sumatotal;
        JOptionPane.showMessageDialog(null, resumen);
    }
}