import java.util.Scanner;

/*
2.	Determinar si un triángulo es equilátero, isósceles o escaleno.
 */
public class Triangulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;
        System.out.println("Digite valores para lados a, b y c: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        if (a == b && a == c) {
            System.out.println("Es un triangulo Equilatero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Es un triangulo Isosceles");
        } else {
            System.out.println("Es un triangulo Escaleno");
        }
    }
}
