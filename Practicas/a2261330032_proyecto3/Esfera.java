import java.io.*;
public class Esfera {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
double r = Double.parseDouble(br.readLine());
System.out.println("Area: " + (4 * Math.PI * r * r));
System.out.println("Volumen: " + (4 * Math.PI * Math.pow(r, 3) / 3));
}
}