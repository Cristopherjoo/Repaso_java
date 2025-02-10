public class Bucle_do_while {
    public static void main(String[] args) {
        int contador = 1;
        final var valor = 5;

        //bucle do while

        do{
            System.out.println("valor: " + contador++);
        }while(contador <= valor);
        System.out.println("Fin del bucle");
    }
}
