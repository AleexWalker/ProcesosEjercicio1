public class Ejercicio1 {
    public static void main(String[] args) {
        int nProcesos = 24;
        int numHebras = 4;
        int[] arrayId = new int[3];
        for (int i = 2 ; i <= nProcesos ; i+=numHebras)
            System.out.println("i = " + i);
    }
}
