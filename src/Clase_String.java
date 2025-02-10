import java.util.Scanner;

public class Clase_String {
    public static void main(String[] args) {
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos

        System.out.println("Ingrese la primera palabra: ");
        palabra1 = entrada.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        palabra2 = entrada.nextLine();

        //comparar textos
        if (palabra1.equals(palabra2)) {
            System.out.println("Primera palabra: " + palabra1 + " Es igual a: " + "Segunda palabra: " + palabra2);
        } else {
            System.out.println("Primera palabra: " + palabra1 + " no es igual a: " + "Segunda palabra: " + palabra2);
        }
        //Comparar textos sin tomar encuenta mayusculas
        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println(" Primera palabra: " + palabra1 + " es igual a: " + "Segunda palabra: " + palabra2 + "\n"
                    + " Sin comparar mayusculas");
        } else {
            System.out.println(" Primera palabra: " + palabra1 + " no es igual a: " + "Segunda palabra: " + palabra2 + "\n"
                    + " Sin comparar mayusculas");
        }

        //Comparar cantidad de caracteres
        if (palabra1.compareTo(palabra2) == 0) {
            System.out.println(palabra1 + " tiene la misma cantidad de letras que: " + palabra2);
        } else if (palabra1.compareTo(palabra2) > 0) {
            System.out.println(palabra1 + " tiene mas letras que: " + palabra2);
        } else {
            System.out.println(palabra1 + " tiene menos letras que: " + palabra2);
        }

        //Saber primer caracter de una palabra
        System.out.println(palabra1.charAt(2));

        //cantidad de caracteres de un texto
        System.out.println(palabra2.length());

        //Identificar varios caracteres en un texto
        System.out.println("Primeras 3 letras: "+ palabra1.substring(0, 3));
        System.out.println("Segundas 3 letras: "+ palabra2.substring(0, 3));

        //buscar caracteres que coincidan en dos palabras
        int coincidencia = palabra1.indexOf(palabra2);
        if (coincidencia == -1) {
            System.out.println(palabra1 + " no contiene: " + palabra2);
        }else {
            System.out.println(palabra1 + " tiene coincidencia con: " + palabra2);
        }

        //mayusculas
        System.out.println(palabra1+ " en mayusculas es: "+ palabra1.toUpperCase());

        //minusculas
        System.out.println(palabra1+ " en minusculas es: "+ palabra1.toLowerCase());
    }
}