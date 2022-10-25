import java.util.Scanner;

/*
10.	Crear una matriz que contenga la tabla de multiplicar de 1 a N, N ingresado por el usuario. Tabla de Pitágoras.
 */
public class TablaDePitagoras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension;
        System.out.println("\tTABLA DE PITAGORAS");
        System.out.print("Ingrese un numero: ");
        dimension = teclado.nextInt();
        dimension++;
        int tabla[][] = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == 0) {
                    tabla[i][j] = j;
                } else if (j == 0) {
                    tabla[i][j] = i;
                } else {
                    tabla[i][j] = i * j;
                }
            }
        }
        for (int i = 0; i < dimension; i++) {
            System.out.println();
            for (int j = 0; j < dimension; j++) {
                System.out.print(tabla[i][j] < 10 ? tabla[i][j] + "   "
                        : tabla[i][j] < 100 ? tabla[i][j] + "  "
                        : tabla[i][j] + " ");
            }
        }
    }
}
