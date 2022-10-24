import java.util.Scanner;

import static java.lang.StrictMath.pow;

/*
8.	Realizar un programa que calcule el valor de: 2^1+2^2+2^3+⋯+2^n
 */
public class Exponentes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, total = 0;
        System.out.print("Digite el limite de la serie: ");
        numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            total += pow(2, i);
        }
        System.out.println("La suma de la serie es: " + total);
    }
}
