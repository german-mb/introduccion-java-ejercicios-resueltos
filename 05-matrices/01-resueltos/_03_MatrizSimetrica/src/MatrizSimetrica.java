//3.	Dada una matriz cuadrada A, determinar si dicha matriz es simétrica. Se considera a una matriz simétrica si A (i, j) = A (j, i) y esto se cumple para todos los elementos i, j de la matriz.
public class MatrizSimetrica {
    public static void main(String[] args) {
        int matriz[][] = {
                {0, 1, 2, 3},
                {1, 0, 4, 5},
                {2, 4, 0, 6},
                {3, 5, 6, 0}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        boolean simetrica = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }
        System.out.println(simetrica ? "La matriz ES simetrica"
                : "La matriz NO ES simetrica");
    }
}
