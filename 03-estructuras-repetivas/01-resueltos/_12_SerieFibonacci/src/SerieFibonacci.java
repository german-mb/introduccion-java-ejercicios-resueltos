import java.util.Scanner;

/*
12.	Realizar un programa que ingrese un número por teclado para mostrar la serie de Fibonacci.
 */
public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, a = 0, b = 1, result = 0;
        System.out.print("Ingrese numero de elementos a mostrar: ");
        numero = teclado.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.print(a + " ");
            result = a + b;
            a = b;
            b = result;
        }
    }
}
