public class Bucle_while {
    public static void main(String[] args) {
        int codigo = 0;

        while (codigo <= 6) {
            System.out.println(codigo);
            if (codigo == 4) {
                System.out.println("Soy la vuelta 3");
            }
            if (codigo == 6) {
                System.out.println("Soy la vuelta 6");
            }
            codigo++;
        }
    }
}
