import java.util.Scanner;

/*
9.	Leer por teclado una tabla de 5 elementos numéricos enteros y una posición (entre 0 y 4 incluidos).  Eliminar el elemento situado en la posición dada sin dejar huecos. Mostrar el elemento eliminado y el nuevo arreglo.
 */
public class DesplazandoNPosiciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension, numero, aux, k;
        System.out.print("DIGITE LA DIMENSION DEL ARREGLO: ");
        dimension = teclado.nextInt();
        int arreglo[] = new int[dimension];
        System.out.print("DIGITE LAS POSICIONES A DESPLAZAR: ");
        k = teclado.nextInt();
        System.out.println("INGRESE VALORES PARA EL ARREGLO");
        for (int i = 0; i < dimension; i++) {
            System.out.print("Posicion " + i + ": ");
            numero = teclado.nextInt();
            arreglo[i] = numero;
        }
        System.out.println("ARREGLO BASE");
        for (int i = 0; i < dimension; i++) {
            System.out.print(arreglo[i] + " ");
        }
        k = k % dimension;
        for (; k > 0; --k) {
            aux = arreglo[dimension - 1];
            for (int i = dimension - 1; i >= 0; i--) {
                if (i == 0) {
                    arreglo[i] = aux;
                } else {
                    arreglo[i] = arreglo[i - 1];
                }
            }
        }
        System.out.println("\nARREGLO CON DESPLAZAMIENTO");
        for (int i = 0; i < dimension; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
