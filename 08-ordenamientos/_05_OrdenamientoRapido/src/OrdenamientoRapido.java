public class OrdenamientoRapido {
    public static void main(String[] args) {
        int arreglo[] = {5, 1, 55, 3, 4, 90, 6, 11, -10, -2, 111, -56};
        int dimen = arreglo.length;
        System.out.println("Arreglo base");
        imprimir(arreglo, dimen);
        ordenar(arreglo, 0, dimen - 1);
        System.out.println("Arreglo ordenado");
        imprimir(arreglo, dimen);
    }

    private static void ordenar(int[] arreglo, int primero, int ultimo) {
        int i, j, pivote;
        i = primero;
        j = ultimo;
        pivote = arreglo[(primero + ultimo) / 2];
        do {
            while (arreglo[i] < pivote) i++;
            while (arreglo[j] > pivote) j--;
            if (i <= j) {
                intercambiar(arreglo, i, j);
                i++;
                j--;
                if (primero < j) ordenar(arreglo, primero, j);
                if (i < ultimo) ordenar(arreglo, i, ultimo);
            }
        } while (i <= j);
    }

    private static void intercambiar(int[] arreglo, int i, int j) {
        int aux;
        aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }

    private static void imprimir(int[] arreglo, int dimen) {
        for (int i = 0; i < dimen; i++)
            System.out.print(arreglo[i] + " ");
        System.out.println();
    }
}
