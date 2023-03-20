import java.util.Scanner;

/*
13.	Crear un programa que pida un número entero y que calcule su factorial.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, factorial = 1;
        System.out.print("Digite un numero: ");
        numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de "
                + numero + " es " + factorial);
    }
}
