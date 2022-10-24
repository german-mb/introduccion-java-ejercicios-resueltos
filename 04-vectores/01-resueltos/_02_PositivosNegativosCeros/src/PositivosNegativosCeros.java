import java.util.Scanner;

/*
2.	Crear un programa que devuelva el número de elementos positivos, negativos y ceros en un array de 10 enteros.
 */
public class PositivosNegativosCeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[], numero, positivos = 0, negativos = 0, ceros = 0;
        arreglo = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Posicion " + i + ": ");
            numero = teclado.nextInt();
            arreglo[i] = numero;
            if (arreglo[i] < 0) negativos++;
            if (arreglo[i] > 0) positivos++;
            if (arreglo[i] == 0) ceros++;
        }
        System.out.println("\nNegativos: " + negativos);
        System.out.println("Positivos: " + positivos);
        System.out.println("Ceros: " + ceros);
    }
}
