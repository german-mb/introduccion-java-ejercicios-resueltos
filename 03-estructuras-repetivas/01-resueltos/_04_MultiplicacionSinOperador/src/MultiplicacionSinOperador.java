import java.util.Scanner;

/*
4.	Multiplicar dos números enteros sin utilizar el operador de multiplicación.
 */
public class MultiplicacionSinOperador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado = 0;
        System.out.print("Digite un numero: ");
        num1 = teclado.nextInt();
        System.out.print("Digite otro numero: ");
        num2 = teclado.nextInt();
        System.out.print(num1 + " * " + num2 + " = ");
        while (num1 > 0) {
            num1--;
            resultado += num2;
        }
        System.out.println(resultado);
    }
}
