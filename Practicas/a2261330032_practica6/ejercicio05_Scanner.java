package a13_practica6;
import java.util.Scanner;

public class ejercicio05_Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cant, sumacant = 0;
        String salida;
        double precio, subtotal, iva, total, sumaiva = 0, sumatotal = 0;

        System.out.print("Introduzca el precio del Refresco coca cola light lata: ");
        precio = entrada.nextDouble();
        System.out.print("Introduzca la cantidad comprada del Refresco coca cola light lata: ");
        cant = entrada.nextInt();
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = total + sumatotal;

        System.out.print("Introduzca el precio 1/4 de Arroz: ");
        precio = entrada.nextDouble();
        System.out.print("Introduzca la cantidad comprada del 1/4 de Arroz: ");
        cant = entrada.nextInt();
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = total + sumatotal;

        System.out.print("Introduzca el precio pieza de pan frances: ");
        precio = entrada.nextDouble();
        System.out.print("Introduzca la cantidad comprada piezas de pan frances: ");
        cant = entrada.nextInt();
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = total + sumatotal;

        System.out.println("el total de productos vendidos fue " + sumacant);
        System.out.println("el total del iva fue " + sumaiva);
        System.out.println("el total " + sumatotal);
    }
}