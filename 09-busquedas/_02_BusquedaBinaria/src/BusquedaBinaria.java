import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 18};
        int buscar, pos;
        System.out.print("Digite el valor a buscar: ");
        buscar = teclado.nextInt();
        pos = buscar(arreglo, buscar);
        if (pos == -1) {
            System.out.println("Valor "
                    + buscar + " no encontrado");
        } else {
            System.out.println("Valor "
                    + buscar + " encontrado en la posicion " + pos);
        }
    }
    private static int buscar(int[] arreglo, int buscar) {
        int dimen = arreglo.length, inferior, superior, mitad;
        inferior = 0;
        superior = dimen - 1;
        while (inferior <= superior) {
            mitad = (inferior + superior) / 2;
            if (arreglo[mitad] == buscar) {
                return mitad;
            }
            if (arreglo[mitad] > buscar) {
                superior = mitad - 1;
                mitad = (inferior + superior) / 2;
            }
            if (arreglo[mitad] < buscar) {
                inferior = mitad + 1;
                mitad = (inferior + superior) / 2;
            }
        }
        return -1;
    }
}
