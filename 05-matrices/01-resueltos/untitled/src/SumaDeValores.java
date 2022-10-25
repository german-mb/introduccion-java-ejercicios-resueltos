import java.util.Scanner;

/*
1.	Crear y cargar una matriz de tamaño n x m y sumar todos los valores de la matriz.
 */
public class SumaDeValores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas, suma = 0;
        System.out.println("Digite las filas y columnas de la matriz: ");
        filas = teclado.nextInt();
        columnas = teclado.nextInt();
        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Posicion: " + i + " " + j + ": ");
                System.out.print(matriz[i][j]);
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de valores de la matriz es: " + suma);
    }
}
