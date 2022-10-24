import java.util.Scanner;

/*
3.	Realizar la resta de dos números enteros sin utilizar el operador de sustracción.
 */
public class RestaSinOperador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado = 0;
        System.out.print("Digite un numero: ");
        num1 = teclado.nextInt();
        System.out.print("Digite otro numero: ");
        num2 = teclado.nextInt();
        System.out.print(num1 + " - " + num2 + " = ");
        if (num1 > num2) {
            while (num1 > num2) {
                num2++;
                resultado++;
            }
        } else {
            while (num2 > num1) {
                num1++;
                resultado++;
            }
            resultado *= -1;
        }
        System.out.println(resultado);
    }
}
