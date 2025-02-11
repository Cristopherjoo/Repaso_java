import java.util.Scanner;

public class Clase_Math {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese valor para calcular la raiz");
        int valorA = entrada.nextInt();

        //Calulo raiz cuadrada
        System.out.println("Raiz de: "+  valorA + Math.sqrt(valorA));

        //calculo de potencia
        var base = 2;
        var exponente = 3;
        System.out.println(" La base: "+ base+ " elevado al exponente "+exponente+" = "+Math.pow(base,exponente));

        // Redondear un número real a la décima posición hacia arriba y hacia abajo
        System.out.println("Ingrese un número real: (Redondear un número real )");
        double numero = entrada.nextDouble();
        double redondeadoHaciaArriba = Math.ceil(numero * 10) / 10;
        double redondeadoHaciaAbajo = Math.floor(numero * 10) / 10;
        System.out.println("Redondeado hacia arriba: " + redondeadoHaciaArriba);
        System.out.println("Redondeado hacia abajo: " + redondeadoHaciaAbajo);

        // Calcular la raíz cuadrada de un número real
        System.out.println("Ingrese un número real: (Calcular la raíz cuadrada)");
        double raizCuadrada = Math.sqrt(entrada.nextDouble());
        System.out.println("Raíz cuadrada: " + raizCuadrada);

        // Calcular la hipotenusa de un triángulo rectángulo con catetos de 3 y 4
        double hipotenusa = Math.hypot(3, 4);
        System.out.println("Hipotenusa: " + hipotenusa);

        // Calcular la media aritmética y la media geométrica de dos números reales
        System.out.println("Ingrese dos números reales: (Calcular la media aritmética y la media geométrica )");
        double numero1 = entrada.nextDouble();
        double numero2 = entrada.nextDouble();
        double mediaAritmetica = (numero1 + numero2) / 2;
        double mediaGeometrica = Math.sqrt(numero1 * numero2);
        System.out.println("Media aritmética: " + mediaAritmetica);
        System.out.println("Media geométrica: " + mediaGeometrica);

        // Calcular la diferencia absoluta entre dos números enteros
        System.out.println("Ingrese dos números enteros: (Calcular la diferencia absoluta)");
        int numeroInt1 = entrada.nextInt();
        int numeroInt2 = entrada.nextInt();
        int diferenciaAbsoluta = Math.abs(numeroInt1 - numeroInt2);
        System.out.println("Diferencia absoluta: " + diferenciaAbsoluta);

        // Calcular el máximo y el mínimo de dos números enteros
        int maximo = Math.max(numeroInt1, numeroInt2);
        int minimo = Math.min(numeroInt1, numeroInt2);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);

        // Redondear un número real al número entero más cercano
        System.out.println("Ingrese un número real: (Redondear un número real al número entero)");
        double redondeado = Math.round(entrada.nextDouble());
        System.out.println("Redondeado al número entero más cercano: " + redondeado);


        //Numero PI
        System.out.println("valor de pi: "+ Math.PI);
        entrada.close();
    }
}