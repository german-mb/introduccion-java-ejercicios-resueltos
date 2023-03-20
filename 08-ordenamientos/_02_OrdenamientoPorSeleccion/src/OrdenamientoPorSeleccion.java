public class OrdenamientoPorSeleccion {
    public static void main(String[] args) {
        int arreglo[] = {0, 1, 234, 3, -2, 5, 28, 11, -10, 23, -6, 36};
        int dimen = arreglo.length;
        System.out.println("Arreglo base");
        imprimir(arreglo, dimen);
        ordenar(arreglo, dimen);
        System.out.println("Arreglo ordenado");
        imprimir(arreglo, dimen);
    }

    private static void ordenar(int[] arreglo, int dimen) {
        int min, aux;
        for (int i = 0; i < dimen; i++) {
            min = i;
            for (int j = i + 1; j < dimen; j++) {
                if (arreglo[j] < arreglo[min]) min = j;
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
            imprimir(arreglo,dimen);
        }
    }

    private static void imprimir(int[] arreglo, int dimen) {
        for (int i = 0; i < dimen; i++)
            System.out.print(arreglo[i] + " ");
        System.out.println();
    }
}
