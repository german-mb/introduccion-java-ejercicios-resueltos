import java.util.Scanner;

/*
2.	Crear un programa que devuelva el número de elementos positivos, negativos y ceros en un array de 10 enteros.
 */
public class PositivosNegativosCeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[], numero, pos = 0, neg = 0, ceros = 0;
        arreglo = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Posicion " + i + ": ");
            numero = teclado.nextInt();
            arreglo[i] = numero;
            if (arreglo[i] < 0) neg++;
            if (arreglo[i] > 0) pos++;
            if (arreglo[i] == 0) ceros++;
        }
        System.out.println("\nNegativos: " + neg);
        System.out.println("Positivos: " + pos);
        System.out.println("Ceros: " + ceros);
    }
}
