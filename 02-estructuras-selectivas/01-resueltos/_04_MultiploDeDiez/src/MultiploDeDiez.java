import java.util.Scanner;

/*
4.	Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10.
 */
public class MultiploDeDiez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Digite un numero: ");
        numero = teclado.nextInt();
        if (numero % 10 == 0) {
            System.out.println(numero + " es multiplo de 10");
        } else {
            System.out.println(numero + " NO es multiplo de 10");
        }
    }
}
