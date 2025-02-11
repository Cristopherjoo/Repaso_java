import javax.swing.*;

public class For_ejercicios {
    public static void main(String[] args) {

        boolean validar = false;
        for (int i = 0; !validar; i++) {
            String email = JOptionPane.showInputDialog(null, "Introduzca el email: ");
            if(email.contains("@") && (email.endsWith(".cl") || email.endsWith(".com") || email.endsWith(".org"))) {
                if(email.contains("gmail") || email.contains("hotmail") || email.contains("yahoo")) {
                    JOptionPane.showMessageDialog(null, "Email ingresado correctamente.");
                    validar = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El correo electrónico debe contener el dominio 'gmail', 'hotmail' o 'yahoo'.");
                }
            } else if (!email.contains("@")) {
                JOptionPane.showMessageDialog(null, "Email no valido " + "\n"
                        + "debe ingresar @: ");
            } else if (!email.endsWith(".cl") || !email.endsWith(".com") || !email.endsWith(".org")) {
                JOptionPane.showMessageDialog(null, "Email no valido " + "\n"
                        + " debe ser: .cl, .com, .org ");
            } else {
                JOptionPane.showMessageDialog(null, "Error: El correo electrónico no es válido.");
            }
        }

    }
}