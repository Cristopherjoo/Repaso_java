public class Arreglos_bucles {
    public static void main(String[] args) {
        String[] productos = {
                "cincel",
                "pala",
                "taladro",
                "carretilla",
                "alicate"};

        for (int i = 1; i < productos.length; i++) {

            System.out.println("Producto: " + i + " " + productos[i - 1]);
        }
    }
}
