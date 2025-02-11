public class Break_continue {
    public static void main(String[] args) {

        int loop2=0;
        for (loop2 = 1; loop2 <= 400; loop2++) {
            //condicion impar if(loop2%2!==0)
            //condicion par if(loop2%2==0)
            if(loop2%2==0){
                continue;//cumple condicion par, continue lo ignora mostrando solo impares
            }
            System.out.println("valor: "+ loop2);

        }
    }
}
