import javax.swing.*;

public class While_ejercicios {
    public static void main(String[] args) {

        final String USUARIO = "user1";
        final String PASSWORD="password123%";

        String username;
        String password;
        int intentos=0;
        final int MAX_INTENTOS=3;

        while (intentos<MAX_INTENTOS) {
            username = JOptionPane.showInputDialog(null, "Ingrese nombre de usuario ");
            password = JOptionPane.showInputDialog(null, "Ingrese su clave ");

            if(username.equals(USUARIO) && password.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(null, USUARIO + " Ingreso correctamente");
                break;
            }else{
                intentos++;
                JOptionPane.showMessageDialog(null, USUARIO + " Usuario o clave incorrecta "+ "/n"
                +" intentolo nuevamente");
            }

            if(intentos>2){
                JOptionPane.showMessageDialog(null, " Intentos excedidos "+ "\n"
                + " Contacte con soporte");
            }
        }
    }
}
