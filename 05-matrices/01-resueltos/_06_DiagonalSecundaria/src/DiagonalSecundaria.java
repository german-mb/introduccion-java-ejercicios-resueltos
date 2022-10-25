import java.util.Scanner;

//6.	Crear una matriz de tamaño n x n, rellenarla de forma que los elementos de la diagonal secundaria sean 1 y el resto 0.
public class DiagonalSecundaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension;
        System.out.print("Digite la dimension de la matriz: ");
        dimension = teclado.nextInt();
        int matriz[][] = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++)
                if (i == dimension - 1 - j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
        }
        for (int i = 0; i < dimension; i++) {
            System.out.println();
            for (int j = 0; j < dimension; j++)
                System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}
