import java.util.Scanner;

/*
1.	Realizar un programa que lea dos números enteros por teclado y muestre todos los números que hay entre el primer y el segundo número.
 */
public class ValoresEntreUnRango {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2;
        System.out.println("Digite dos valores: ");
        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();
        if (valor1 > valor2) {
            System.out.println("");
            while (valor2 <= valor1) {
                System.out.println(valor2);
                valor2++;
            }
        } else {
            System.out.println("");
            while (valor1 <= valor2) {
                System.out.println(valor1);
                valor1++;
            }
        }
    }
}
