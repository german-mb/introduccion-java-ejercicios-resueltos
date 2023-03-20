import java.util.Scanner;

/*
2.	Crear solo los bordes de un cuadrado con dimensión variable.
 */
public class BordesCuadrado {
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
                if (i == 0 || i == dimen - 1
                        || j == 0 || j == dimen - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
