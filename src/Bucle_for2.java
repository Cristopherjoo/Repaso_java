public class Bucle_for2 {
    public static void main(String[] args) {

        int suma=0;
        for (int i = 0; i <= 20; i++) {
            if(i%2==0){
                suma=suma+i;
                //suma+=
                System.out.println("valor sumado: "+i);
            }
        }
        System.out.println("Suma de pares: "+suma);
    }
}
