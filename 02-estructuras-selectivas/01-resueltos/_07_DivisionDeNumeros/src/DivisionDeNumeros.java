import java.util.Scanner;

/*
7.	Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo. Se debe comprobar que el divisor no puede ser cero.
 */
public class DivisionDeNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b;
        System.out.println("Ingrese dos valores: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        if (b == 0) {
            System.out.println("El divisor debe ser distinto de 0");
        } else {
            System.out.println(a + " / " + b + " = " + a / b);
        }
    }
}
