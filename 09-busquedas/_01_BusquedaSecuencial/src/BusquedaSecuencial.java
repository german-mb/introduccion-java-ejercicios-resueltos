import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = {4, 56, -1, 6, 3, -10, 19, 9, 1, 2, 4, 18, 4};
        int dimen = arreglo.length, buscar, pos;
        System.out.print("Digite el valor a buscar: ");
        buscar = teclado.nextInt();
        pos = buscar(arreglo, buscar, dimen);
        if (pos == -1) {
            System.out.println("Valor "
                    + buscar + " no encontrado");
        } else {
            System.out.println("Valor "
                    + buscar + " encontrado en la posicion " + pos);
        }


    }

    private static int buscar(int[] arreglo, int buscar, int dimen) {
        int i;
        boolean encontrado = false;
        for (i = 0; i < dimen && encontrado == false; i++) {
            if (buscar == arreglo[i]) return i;
        }
        return -1;
    }
}
