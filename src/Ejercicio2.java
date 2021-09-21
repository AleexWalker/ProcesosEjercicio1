public class Ejercicio2 {
    public static void main(String[] args) {
        int nProcesos = 24;
        int numHebras = 4;
        int hebra = 0 ;
        for (int i = nProcesos/numHebras * hebra ; i < (hebra+1)*nProcesos/numHebras ; i++)
            System.out.println("i = " + i);
    }
}
