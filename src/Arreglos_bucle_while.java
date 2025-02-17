public class Arreglos_bucle_while {
    public static void main(String[] args) {
        //recorrer array con bucle for

        String[] frutas={
                "",
                "Fresa",
                "Mango",
                "Naranja",
                "Pera",
                "Uva"};
        int i = 1;
        while (i < frutas.length) {
            System.out.println("Producto: "+i+" "+ frutas[i]);
            i++;
        }

    }
}
