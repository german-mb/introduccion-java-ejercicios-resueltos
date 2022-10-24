import java.util.Scanner;

/*
5.	Realizar la división de dos números enteros sin utilizar dicho operador.
 */
public class DivisionSinOperador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultado = 0;
        System.out.print("Digite un numero: ");
        num1 = teclado.nextInt();
        System.out.print("Digite otro numero: ");
        num2 = teclado.nextInt();
        if (num2 != 0) {
            System.out.print(num1 + " / " + num2 + " = ");
            while (num1 >= num2) {
                resultado++;
                num1 -= num2;
            }
            System.out.println(resultado);
        } else {
            System.out.println("No puede dividir por 0");
        }
    }
}
