public class Arreglos_combinacion {
    public static void main(String[] args) {

        // Eliminar el primer elemento vacío y el primer precio 0.
        String[] productos = {
                "cincel",
                "pala",
                "taladro",
                "carretilla",
                "alicate"};

        int[] precios = {2500, 32000, 65000, 120000, 3600};

        for (int i = 0; i < productos.length; i++) {
            if (precios[i] < 4000) {
                System.out.println(productos[i] + ": $" + precios[i] + " exento de IVA");
            } else {
                System.out.println(productos[i] + ": $" + precios[i]);
            }
        }
    }
}
