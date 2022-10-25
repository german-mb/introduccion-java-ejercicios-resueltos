import java.util.Scanner;

//4.	Realizar un programa para crear y cargar una matriz de n x n, trasponerla y mostrarla.
public class MatrizTraspuesta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension;
        System.out.print("Digitar dimension de la matriz: ");
        dimension = teclado.nextInt();
        int matriz[][] = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("Posicion: " + i + "," + j + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.print("\tMATRIZ BASE");
        for (int i = 0; i < dimension; i++) {
            System.out.println();
            for (int j = 0; j < dimension; j++)
                System.out.print(matriz[i][j] + " ");
        }
        System.out.print("\n\tMATRIZ TRASPUESTA");
        for (int i = 0; i < dimension; i++) {
            System.out.println();
            for (int j = 0; j < dimension; j++)
                System.out.print(matriz[j][i] + " ");
        }
    }
}
