import java.util.Scanner;

public class Input_datos {
    public static void main(String[] args) {

        String nombre;
        int edad;

        //Ingresa datos
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Escribre tu nombre: ");
        nombre = ingreso.next();

        System.out.println("Escribe tu edad: ");
        edad = ingreso.nextInt();

        //Salida de datos
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);

    }
}
