/*
9.	Crear un programa para mostrar por consola un árbol de navidad.
 */
public class ArbolNavidad {
    public static void main(String[] args) {
        figura();
    }

    private static void figura() {
        for (int i = 0; i <= 3; i++) {
            System.out.println();
            for (int j = 15 - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print(" *");
        }
        for (int i = 0; i <= 15; i++) {
            for (int j = 15 - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 15; j++) {
                if (j >= 6 && j <= 8) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
