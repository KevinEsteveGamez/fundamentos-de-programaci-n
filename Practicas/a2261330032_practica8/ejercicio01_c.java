package a2261330032_practica8;
import javax.swing.JOptionPane;
public class ejercicio01_c {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número (0 a 99):"));
        int unidades = num % 10;
        int decenas = num / 10;
        String cadena = "";
        switch(decenas){
            case 1: cadena="diez"; break;
        }
        switch(unidades){
            case 1: if(decenas==1) cadena="once"; else if(decenas>1) cadena=cadena+" y uno"; else cadena="uno"; break;
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}