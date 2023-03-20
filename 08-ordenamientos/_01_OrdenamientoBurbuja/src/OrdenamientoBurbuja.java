public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int arreglo[] = {4, 78, 2, 9, -4, 7, 1, -1, -8, 8, 123, 44, -6};
        System.out.println("Arreglo base");
        imprimir(arreglo);
        ordenar(arreglo);
        System.out.println("Arreglo ordenado");
        imprimir(arreglo);
    }

    private static void imprimir(int[] arreglo) {
        int dimen = arreglo.length;
        for (int i = 0; i < dimen; i++)
            System.out.print(arreglo[i] + " ");
        System.out.println("");
    }

    private static void ordenar(int[] arreglo) {
        int dimen = arreglo.length, aux;
        for (int i = 0; i < dimen; i++) {
            for (int j = 0; j < dimen - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
            imprimir(arreglo);
        }
    }
}
