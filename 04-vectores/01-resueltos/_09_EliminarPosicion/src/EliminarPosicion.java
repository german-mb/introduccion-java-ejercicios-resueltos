import java.util.Scanner;
/*
09. Leer por teclado una tabla de 5 elementos numéricos enteros y una posición (entre 0 y 4 incluidos).  Eliminar el elemento situado en la posición dada sin dejar huecos. Mostrar el elemento eliminado y el nuevo arreglo.
 */
public class EliminarPosicion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[], numero, eliminar = 0;
        arreglo = new int[5];
        System.out.println("Digite valores para el arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicion " + i + ": ");
            arreglo[i] = teclado.nextInt();
        }
        System.out.println("Arreglo base");
        for (int i = 0; i < 5; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\nDigite una posicion entre 0 - 4: ");
        eliminar = teclado.nextInt();
        numero = arreglo[eliminar];
        for (int i = eliminar; i < 5 - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        System.out.println("Valor eliminado: " + numero);
        System.out.println(
                "Arreglo despues de eliminar la posicion "
                        + eliminar);
        for (int i = 0; i < 5 - 1; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}