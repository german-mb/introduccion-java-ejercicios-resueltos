import java.util.Scanner;

/*
9.	Crear una matriz marco de n x n; todos sus elementos deben ser 0 salvo los bordes que deben ser 1.
 */
public class MatrizMarco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension;
        System.out.print("Digite la dimension de la matriz: ");
        dimension = teclado.nextInt();
        int matriz[][] = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == 0 || j == 0 || i == dimension - 1 || j == dimension - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < dimension; i++) {
            System.out.println();
            for (int j = 0; j < dimension; j++)
                System.out.print(matriz[i][j] + " ");
        }
    }
}
