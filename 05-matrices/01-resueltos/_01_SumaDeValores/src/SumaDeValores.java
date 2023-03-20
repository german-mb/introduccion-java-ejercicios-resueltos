import java.util.Scanner;

/*
1.	Crear y cargar una matriz de tamaño n x m y sumar todos los valores de la matriz.
 */
public class SumaDeValores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas, suma = 0;
        System.out.println("Digite las filas de la matriz: ");
        filas = teclado.nextInt();
        System.out.println("Digite las columnas de la matriz: ");
        columnas = teclado.nextInt();
        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Posicion: "
                        + i + " " + j + ": ");
                matriz[i][j] = teclado.nextInt();
                suma += matriz[i][j];
            }
        }
        System.out.println(
                "La suma de valores de la matriz es: " + suma);
    }
}
