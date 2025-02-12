import java.util.Arrays;

public class Arreglos_metodos {
    public static void main(String[] args) {
        //Arrays.sort() - Ordenar un array:


        int[] numeros1 = {5, 2, 8, 1, 4};
        Arrays.sort(numeros1);
        System.out.println(Arrays.toString(numeros1)); // [1, 2, 4, 5, 8]

       //Arrays.binarySearch() - Búsqueda binaria en un array ordenado:

        int[] numeros2 = {1, 2, 4, 5, 8};
        int indice = Arrays.binarySearch(numeros2, 4);
        System.out.println(indice); // 2 (índice de 4)

        //Arrays.copyOf() - Copiar un array a otro:

        int[] numeros3 = {1, 2, 3};
        int[] copia = Arrays.copyOf(numeros3, 5);
        System.out.println(Arrays.toString(copia)); // [1, 2, 3, 0, 0]

        //Arrays.equals() - Comparar dos arrays:

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println(Arrays.equals(array1, array2)); // true

        //Arrays.fill() - Rellenar un array con un valor específico:

        int[] numeros4 = new int[5];
        Arrays.fill(numeros4, 7);
        System.out.println(Arrays.toString(numeros4)); // [7, 7, 7, 7, 7]


        //Arrays.toString() - Convertir un array en una cadena de texto:

        int[] numeros = {1, 2, 3};
        System.out.println(Arrays.toString(numeros)); // [1, 2, 3]
    }
}
