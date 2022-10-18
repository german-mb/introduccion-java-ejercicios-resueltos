import java.util.Scanner;

import static java.lang.StrictMath.pow;

/*
	Hacer un programa que calcule el cuadrado de una suma. 〖(a+b)〗^2=a^2+b^2+2ab
 */
public class CuadradoSuma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, resultado;
        System.out.println("Digite los valores de a y b: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        resultado = pow(a, 2) + pow(b, 2) + (2 * a * b);
        System.out.println("El resultado es: " + resultado);
    }
}
