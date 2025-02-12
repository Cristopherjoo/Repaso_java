public class Arreglos {

    public static void main(String[] args) {

        //Declaracion de un array
        int[] numeros = new int[5];//predefinido

        //Inicializar un array

        numeros[0] = 10; //posicion [0] hay 10
        numeros[1] = 20; //posicion [1] hay 20
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];
        int d = numeros[3];
        int e = numeros[4];
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //Inicializar un array
        //inicializando sin limites: int[] <-- vacio
        int[] valores = {123,345,567,890,36};

        //Consultar un array
        System.out.println(numeros[4]);
        System.out.println(valores[3]);

    }
}
