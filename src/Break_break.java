public class Break_break {
    public static void main(String[] args) {

        int loop=0;

        System.out.println("Cargando registros: ");
        while(loop<=10){
            System.out.println("Ciclo: "+loop);
            loop++;
            if(loop==9){
                System.out.println("Error de carga, saliendo del sistema");
                break;//rompe el bucle y no lo deja llegar a 9
            }
        }
        System.out.println("Fin del bucle");
    }
}
