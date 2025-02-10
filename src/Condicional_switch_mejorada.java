import java.util.Scanner;

public class Condicional_switch_mejorada {
    public static void main(String[] args) {

        int DiaSemana;
        Scanner Ingresar = new Scanner(System.in);

        //Ingresando datos
        System.out.println("Ingrese dia a consultar");
        DiaSemana = Ingresar.nextInt();
        switch (DiaSemana) {
            case 1->System.out.println("Lunes");
            case 2->System.out.println("Martes");
            case 3->System.out.println("Miercoles");
            case 4->System.out.println("Jueves");
            case 5->System.out.println("Viernes");
            case 6->System.out.println("Sabado");
            case 7->System.out.println("Domingo");
            default -> System.out.println("Valor incorrecto, cerrando programa");
        }
    }
}
