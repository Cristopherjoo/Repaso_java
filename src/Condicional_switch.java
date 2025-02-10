import java.util.Scanner;

public class Condicional_switch {
    public static void main(String[] args) {

        int DiaSemana;
        Scanner Ingresar = new Scanner(System.in);

        //Ingresando datos
        System.out.println("Ingrese dia a consultar");
        DiaSemana = Ingresar.nextInt();
        switch (DiaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero invalido, saliendo del sistema");
                break;

        }

    }
}
