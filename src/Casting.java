public class Casting {
    public static void main(String[] args) {
        // De texto a entero
        String textoNumero = "123";
        int numeroConvertido = Integer.parseInt(textoNumero);
        System.out.println("numeroConvertido: " + numeroConvertido);

        // De entero a texto
        int numeroEntero = 1234;
        String textoConvertido = String.valueOf(numeroEntero);
        System.out.println("textoConvertido: " + textoConvertido);

        // De double a entero
        double numeroDecimal = 23.20;
        int numeroEnteroDesdeDouble = (int) numeroDecimal;
        System.out.println("numeroEnteroDesdeDouble: " + numeroEnteroDesdeDouble);

        // De entero a double
        int numeroEntero2 = 1234;
        double numeroDecimalDesdeEntero = numeroEntero2;
        System.out.println("numeroDecimalDesdeEntero: " + numeroDecimalDesdeEntero);
    }
}