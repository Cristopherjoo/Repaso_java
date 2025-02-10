import java.util.Scanner;

public class Bucle_while2 {
    public static void main(String[] args) {
        int codigo2= 0;
        Scanner sc = new Scanner(System.in);

        //tabla multiplicar

        int valor;
        System.out.println(" Ingrese tabla a consultar");
        valor = sc.nextInt();

        while (codigo2<=10){
            System.out.println(valor+" X " + codigo2+" = "+valor*codigo2);
            codigo2++;
        }
        System.out.println("Fin del bucle");
    }
}
