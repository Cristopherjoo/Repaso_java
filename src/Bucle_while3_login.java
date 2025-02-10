import java.util.Scanner;

public class Bucle_while3_login {
    public static void main(String[] args) {

        //control login usuario
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

        final String username = "michi";
        final String password = "12345";

        boolean acceso = false;

        while (!acceso) {
            System.out.println("Ingrese su usuario: ");
            String usuario= sc.nextLine();

            System.out.println("Ingrese su password: ");
            String clave = sc.nextLine();
            if(username.equals(usuario) && password.equals(clave)) {
                System.out.println("Acceso correcto");
                acceso = true;

            }else{
                System.out.println("Usuario / contrasena  incorrectos" +"Intentelo de nuevo");
            }
        }
        System.out.println("Fin del bucle");
    }
}
