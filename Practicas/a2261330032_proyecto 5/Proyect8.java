import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Proyect8 {
    public static void main(String[] args) throws Exception {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("precio base del producto: ");
        double precioBase = Double.parseDouble(leer.readLine());
        
        System.out.print("porcentaje de descuento: ");
        double porcentajeDescuento = Double.parseDouble(leer.readLine());
        
        System.out.print("porcentaje de IVA ");
        double porcentajeIva = Double.parseDouble(leer.readLine());
        
        double montoDescuento = precioBase * (porcentajeDescuento / 100.0);
        double precioSinIva = precioBase - montoDescuento;
        
        double montoIva = precioSinIva * (porcentajeIva / 100.0);
        double precioConIva = precioSinIva + montoIva;
                System.out.println("Resultados");
        System.out.println("Precio original: $" + precioBase);
        System.out.println("Precio con descuento (SIN IVA): $" + precioSinIva);
        System.out.println("Precio final a pagar (CON IVA): $" + precioConIva);
    }
}