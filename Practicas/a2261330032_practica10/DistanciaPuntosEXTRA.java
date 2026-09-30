package a2261330032_practica10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DistanciaPuntosEXTRA {
    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = Double.parseDouble(br.readLine());

        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = Double.parseDouble(br.readLine());

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = Double.parseDouble(br.readLine());

        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = Double.parseDouble(br.readLine());

        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        System.out.printf("La distancia euclídea entre los puntos es: %.4f\n", distancia);
    }
}