import java.util.Scanner;

//8.	Crear una matriz n x m, asignar valores en cada posición y mostrar la suma de los números pares.
public class SumaDePares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fils, cols, pares = 0;
        System.out.print("Numero de filas: ");
        fils = teclado.nextInt();
        System.out.print("Numero de columnas: ");
        cols = teclado.nextInt();
        int matriz[][] = new int[fils][cols];
        System.out.println("INGRESE VALORES PARA LA MATRIZ");
        for (int i = 0; i < fils; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Posicion: " + i + "," + j + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < fils; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < fils; i++) {
            for (int j = 0; j < cols; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares += matriz[i][j];
                }
            }
        }
        System.out.println("Suma de numeros pares: " + pares);
    }
}
