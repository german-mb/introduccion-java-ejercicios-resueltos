public class OrdenamientoPorInsercion {
    public static void main(String[] args) {
        int arreglo[] = {-18, 1, 120, 4, 2, 9, -11, 1, 6, 11, -10, 23};
        int dimen = arreglo.length;
        System.out.println("Arreglo base");
        imprimir(arreglo, dimen);
        ordenar(arreglo, dimen);
        System.out.println("Arreglo ordenado");
        imprimir(arreglo, dimen);
    }

    private static void ordenar(int[] arreglo, int dimen) {
        int pos, aux;
        for (int i = 0; i < dimen; i++) {
            pos = i;
            aux = arreglo[i];
            while ((pos > 0) && (arreglo[pos - 1] > aux)) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = aux;
        }
    }

    private static void imprimir(int[] arreglo, int dimen) {
        for (int i = 0; i < dimen; i++)
            System.out.print(arreglo[i] + " ");
        System.out.println();
    }
}
