import java.util.Scanner;

//7.	Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna.
public class SumaFilaColumna {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas, columnas;
        System.out.print("Numero de filas: ");
        filas = teclado.nextInt();
        System.out.print("Numero de columnas: ");
        columnas = teclado.nextInt();
        int matriz[][] = new int[filas][columnas], suma_filas[] = new int[filas], suma_columnas[] = new int[columnas];
        for (int i = 0; i < filas; i++) suma_filas[i] = 0;
        for (int i = 0; i < columnas; i++) suma_columnas[i] = 0;
        System.out.println("INGRESE VALORES PARA LA MATRIZ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Posicion: " + i + "," + j + ": ");
                matriz[i][j] = teclado.nextInt();
                suma_filas[i] += matriz[i][j];
                suma_columnas[j] += matriz[i][j];
            }
        }
        System.out.println("\tMATRIZ BASE");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\tSUMA FILAS");
        for (int i = 0; i < filas; i++)
            System.out.println("Fila " + i + 1 + ": " + suma_filas[i]);
        System.out.println("\tSUMA COLUMNAS");
        for (int i = 0; i < columnas; i++)
            System.out.println("Columna " + i + 1 + ": " + suma_columnas[i]);
    }
}
