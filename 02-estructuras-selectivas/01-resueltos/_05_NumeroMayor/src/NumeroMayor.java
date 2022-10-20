import java.util.Scanner;

/*
5.	Realizar un programa que pida dos números y diga cuál es el mayor o si son iguales.
 */
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b;
        System.out.println("Digite valores para a y b: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        if (a == b) {
            System.out.println("Los valores son iguales");
        } else if (a > b) {
            System.out.println("El numero mayor es: " + a);
        } else {
            System.out.println("El numero mayor es: " + b);
        }
    }
}
