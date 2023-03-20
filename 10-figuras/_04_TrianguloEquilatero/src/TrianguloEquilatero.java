import java.util.Scanner;

/*
4.	Crear un programa que muestre un triángulo equilátero con dimensión variable.
 */
public class TrianguloEquilatero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
        System.out.print("Digite la altura: ");
        altura = teclado.nextInt();
        figura(altura);
    }

    private static void figura(int altura) {
        for (int i = 0; i <= altura; i++) {
            for (int j = altura - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
