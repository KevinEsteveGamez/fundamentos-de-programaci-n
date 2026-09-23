package a13_practica6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ejercicio05_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int cant, sumacant = 0;
        String salida;
        double precio, subtotal, iva, total, sumaiva = 0, sumatotal = 0;

        System.out.print("Introduzca el precio del Refresco coca cola light lata: ");
        precio = Double.parseDouble(entrada.readLine());
        System.out.print("Introduzca la cantidad comprada del Refresco coca cola light lata: ");
        cant = Integer.parseInt(entrada.readLine());
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = total + sumatotal;

        System.out.print("Introduzca el precio 1/4 de Arroz: ");
        precio = Double.parseDouble(entrada.readLine());
        System.out.print("Introduzca la cantidad comprada del 1/4 de Arroz: ");
        cant = Integer.parseInt(entrada.readLine());
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = total + sumatotal;

        System.out.print("Introduzca el precio pieza de pan frances: ");
        precio = Double.parseDouble(entrada.readLine());
        System.out.print("Introduzca la cantidad comprada piezas de pan frances: ");
        cant = Integer.parseInt(entrada.readLine());
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