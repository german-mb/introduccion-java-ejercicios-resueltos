import java.util.Scanner;

/*
20.	Realizar un programa para calcular el máximo común divisor de dos números.
 */
public class MaximoComunDivisor {
    public static void main(String[] args) {
        int[] numero = new int[4];
        numero[0] = 5;
        numero[1] = 59;
        numero[2] = 23;
        numero[3] = 2;
        numero[4] = -2;
        Scanner teclado = new Scanner(System.in);
        int num1, num2, mcd = 0, aux, r;
        System.out.print("Ingrese un numero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese otro numero: ");
        num2 = teclado.nextInt();
        if (num1 < 0 && num2 < 0) {
            System.out.println("No se completo la operacion");
        } else {
            mcd = num1;
            aux = num2;
            do {
                r = mcd % aux;
                mcd = aux;
                aux = r;
            } while (r != 0);
            if (mcd < 0) {
                System.out.println("El MCD es: " + (mcd * -1));
            } else {
                System.out.println("El MCD es: " + mcd);
            }
        }
    }
}

