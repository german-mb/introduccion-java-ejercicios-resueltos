import java.util.Scanner;

/*
14.	Ingresar por teclado un número que debe estar entre 1 y 10 y mostrar la tabla de multiplicar de dicho número.
 */
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero entre 1 - 10: ");
        numero = teclado.nextInt();
        if (numero > 0 && numero <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " * "
                        + i + " = " + numero * i);
            }
        } else {
            System.out.println("Numero fuera de rango");
        }
    }
}
