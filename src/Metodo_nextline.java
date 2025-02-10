import java.util.Scanner;

public class Metodo_nextline {
    public static void main(String[] args) {
        String texto1, texto2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese texto 1: ");
        texto1 = sc.nextLine();

        System.out.println("Ingrese texto 2: ");
        texto2 = sc.nextLine();


        System.out.println("\nTexto 1: " + texto1);
        System.out.println("Texto 2: " + texto2);

        sc.close();
    }
}
