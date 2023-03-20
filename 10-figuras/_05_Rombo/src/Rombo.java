import java.util.Scanner;

/*
5.	Crear un rombo de asteriscos con dimensión variable.
 */
public class Rombo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado;
        System.out.print("Digite el lado del rombo: ");
        lado = teclado.nextInt();
        figura(lado);
    }

    private static void figura(int lado) {
        for (int i = 0; i <= lado; i++) {
            for (int j = lado - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 0; i <= lado; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" ");
            for (int j = lado - i - 1; j > 0; j--)
                System.out.print(" *");
            System.out.println();
        }
    }
}
