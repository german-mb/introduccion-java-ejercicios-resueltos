import java.util.Scanner;

/*
6.	Ingresar por teclado una serie de 5 números enteros. La aplicación debe indicar si los números están ordenados de forma creciente, decreciente, o si están desordenados.
 */
public class TiposDeOrden {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[], numero;
        String str_result = "";
        boolean ascendente = true, descendente = true;
        arreglo = new int[5];
        System.out.println("Digite valores para el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicion " + i + ": ");
            numero = teclado.nextInt();
            arreglo[i] = numero;
        }
        for (int i = 0; i < 4; i++) {
            if (arreglo[i] < arreglo[i + 1])
                descendente = false;
            if (arreglo[i] > arreglo[i + 1])
                ascendente = false;
        }
        System.out.println(
                ascendente ? "ARREGLO ASCENDENTE "
                        : descendente ? "ARREGLO DESCENDENTE "
                        : "ARREGLO DESORDENADO ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
}
