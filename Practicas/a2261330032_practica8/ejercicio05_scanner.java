package a2261330032_practica8;
import java.util.Scanner;

public class ejercicio05_scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String producto1 = "coca cola light lata 400 ml", producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0, precio2 = 15.0;
        
        System.out.println("Menu de Opciones\n1.- Productos\n2.- Punto de venta\nQue opcion deseas:");
        int opc = entrada.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("El " + producto1 + " cuesta " + precio1);
                System.out.println("El " + producto2 + " cuesta " + precio2);
                break;
            case 2:
                System.out.println("Introduce la cantidad comprada de producto 1:");
                int cant1 = entrada.nextInt();
                System.out.println("Introduzca la cantidad comprada de producto 2:");
                int cant2 = entrada.nextInt();
                
                double subtotal1 = cant1 * precio1;
                double iva1 = subtotal1 * 0.16;
                double total1 = subtotal1 + iva1;
                System.out.println(cant1 + " " + producto1 + " - subtotal: " + subtotal1 + " iva: " + iva1 + " total: " + total1);
                
                double subtotal2 = cant2 * precio2;
                double iva2 = subtotal2 * 0.16;
                double total2 = subtotal2 + iva2;
                System.out.println(cant2 + " " + producto2 + " - subtotal: " + subtotal2 + " iva: " + iva2 + " total: " + total2);
                
                System.out.println("Gran Total Venta -> Subtotal: " + (subtotal1+subtotal2) + " IVA: " + (iva1+iva2) + " Total: " + (total1+total2));
                break;
            default:
                System.out.println("eleccion incorrecta");
                break;
        }
    }
}