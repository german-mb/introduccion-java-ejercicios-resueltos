import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

/*
9.	Realizar un programa que calcule el valor que toma la siguiente función para valores dados de x, y:
f(x,y)=√x/(y^2-1)

 */
public class FuncionXY {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, y, resultado;
        System.out.print("Ingrese el valor de x: ");
        x = teclado.nextFloat();
        System.out.print("Ingrese el valor de y: ");
        y = teclado.nextFloat();
        resultado = (sqrt(x)) / (pow(y, 2) - 1);
        System.out.println("El resultado es: " + resultado);
    }
}
