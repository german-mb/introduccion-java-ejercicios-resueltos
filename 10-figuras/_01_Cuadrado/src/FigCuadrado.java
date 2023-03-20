import java.util.Scanner;

/*
1.	Crear un cuadrado de dimensión variable.
 */
public class FigCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimen;
        System.out.print("Digite la dimension: ");
        dimen = teclado.nextInt();
        figura(dimen);
    }

    private static void figura(int dimen) {
        for (int i = 0; i < dimen; i++) {
            for (int j = 0; j < dimen; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
