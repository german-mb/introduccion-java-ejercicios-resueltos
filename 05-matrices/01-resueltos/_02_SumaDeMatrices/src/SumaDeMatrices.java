import java.util.Scanner;

/*
2.	Realizar un programa para sumar 2 matrices. Sean 2 matrices A y B, para que se puedan sumar deben poseer el mismo número de filas y columnas, cada elemento de la matriz resultante será la suma de los correspondientes elementos de las matrices A y B. C (i, j) = A (i, j) + B (i, j).
 */
public class SumaDeMatrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filA, colA, filB, colB;
        System.out.println("Digite filas y columnas de la matriz A: ");
        filA = teclado.nextInt();
        colA = teclado.nextInt();
        System.out.println("Digite filas y columnas de la matriz B: ");
        filB = teclado.nextInt();
        colB = teclado.nextInt();
        if (filA == filB && colA == colB) {
            int matrizA[][] = new int[filA][filB], matrizB[][] = new int[filB][colB], matrizC[][] = new int[filA][colA];
            System.out.println("\tVALORES PARA MATRIZ A");
            for (int i = 0; i < filA; i++) {
                for (int j = 0; j < colA; j++) {
                    System.out.print("Posicion: " + i + " " + j + ": ");
                    matrizA[i][j] = teclado.nextInt();
                }
            }
            System.out.println("\tVALORES PARA MATRIZ B");
            for (int i = 0; i < filB; i++) {
                for (int j = 0; j < colB; j++) {
                    System.out.print("Posicion: " + i + " " + j + ": ");
                    matrizB[i][j] = teclado.nextInt();
                }
            }
            for (int i = 0; i < filB; i++) {
                for (int j = 0; j < colB; j++)
                    matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
            System.out.print("\tMATRIZ C");
            for (int i = 0; i < filB; i++) {
                System.out.println("");
                for (int j = 0; j < colB; j++)
                    System.out.print(matrizC[i][j] + " ");
            }
        } else {
            System.out.println("No se puede sumar las matrices");
        }
    }
}
