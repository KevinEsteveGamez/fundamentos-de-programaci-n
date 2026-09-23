import java.io.*;
public class Cant_Arena {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
double largo = Double.parseDouble(br.readLine());
double ancho = Double.parseDouble(br.readLine());
System.out.println("Cantidad: " + (largo * ancho * 0.5));
}
}