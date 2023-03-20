import java.util.Scanner;

/*
6.	Crear un paralelogramo de dimensión variable.
 */
public class Paralelogramo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, altura;
        System.out.print("Digite la base: ");
        base = teclado.nextInt();
        System.out.print("Digite la altura: ");
        altura = teclado.nextInt();
        figura(base, altura);
    }

    private static void figura(int base, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = altura - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j < base; j++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
