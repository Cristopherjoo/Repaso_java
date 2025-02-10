import javax.swing.*;

public class Condicional_if {
    public static void main(String[] args) {
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, " Ingresa tu nombre: ");
        String edad2=JOptionPane.showInputDialog(null, " Ingresa tu edad: ");
        edad = Integer.parseInt(edad2);

        //Analizando datos
        if(edad>18){
            JOptionPane.showMessageDialog(null, "Eres mayor de edad");
        }else{
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
        }
    }
}
