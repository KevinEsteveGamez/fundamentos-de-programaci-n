package a2261330032_practica10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TrigonometriaEXTRA{

    public static void mostrarRazonesTrigonometricas(double anguloGrados) {
        double anguloRadianes = Math.toRadians(anguloGrados);
        
        System.out.printf("Seno: %.4f\n", Math.sin(anguloRadianes));
        System.out.printf("Coseno: %.4f\n", Math.cos(anguloRadianes));
        System.out.printf("Tangente: %.4f\n", Math.tan(anguloRadianes));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el valor del ángulo en grados: ");
        double angulo = Double.parseDouble(br.readLine());

        mostrarRazonesTrigonometricas(angulo);
    }
}