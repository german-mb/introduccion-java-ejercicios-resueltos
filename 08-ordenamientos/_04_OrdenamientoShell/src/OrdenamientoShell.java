public class OrdenamientoShell {
    public static void main(String[] args) {
        int arreglo[] = {5, 1, -7, 55, 3, 4, 90, 6, 11, -10, -2};
        int dimen = arreglo.length;

        System.out.println("Arreglo base");
        imprimir(arreglo, dimen);
        ordenar(arreglo, dimen);
        System.out.println("Arreglo ordenado");
        imprimir(arreglo, dimen);
    }

    private static void ordenar(int[] arreglo, int dimen) {
        int salto, j, k, aux;
        salto = dimen / 2;
        while (salto > 0) {
            for (int i = salto; i < dimen; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (arreglo[j] <= arreglo[k])
                        j = -1;
                    else {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[k];
                        arreglo[k] = aux;
                        j -= salto;
                    }
                }
            }
            salto = salto / 2;
        }
    }

    private static void imprimir(int[] arreglo, int dimen) {
        for (int i = 0; i < dimen; i++)
            System.out.print(arreglo[i] + " ");
        System.out.println();
    }
}
