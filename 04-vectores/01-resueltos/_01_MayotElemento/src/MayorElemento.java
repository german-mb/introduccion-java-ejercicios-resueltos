import java.sql.Array;
import java.util.Scanner;

/*
1.	Crear un programa que lea 5 números enteros por teclado, guardar en un arreglo y determinar el mayor elemento.
 */
public class MayorElemento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[], mayor, numero;
        arreglo = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicion " + i + ": ");
            numero = teclado.nextInt();
            arreglo[i] = numero;
        }
        mayor = arreglo[0];
        for (int i = 0; i < 5; i++) {
            System.out.print(arreglo[i] + " ");
            if (arreglo[i] > mayor) mayor = arreglo[i];
        }
        System.out.println("\nEl numero mayor es: " + mayor);
    }
}
