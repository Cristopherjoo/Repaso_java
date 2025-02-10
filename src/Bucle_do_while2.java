import java.util.Scanner;

public class Bucle_do_while2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int errores = 0;

        do {
            System.out.println("Ingrese el numero 6 ");
            numero = sc.nextInt();

            if (numero != 6) {
                System.out.println("debes ingresar el numero 6 ");
                errores++;
            }

        } while (numero != 6);
        if (errores > 1) {
            System.out.println("fallaste: " + errores + " veces");
        } else {
            System.out.println("fallaste: " + errores + " vez");
        }

        System.out.println("Fin del programa");
    }
}
