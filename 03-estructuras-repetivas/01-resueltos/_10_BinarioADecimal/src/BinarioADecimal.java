import java.util.Scanner;

import static java.lang.StrictMath.pow;

/*
10.	Realizar un programa para convertir de binario a número decimal.
 */
public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long binario, decimal = 0, i = 0, temp;
        System.out.print("Ingrese un numero binario: ");
        binario = teclado.nextLong();
        System.out.println("Binario " + binario);
        while (binario != 0) {
            temp = binario % 10;
            binario /= 10;
            decimal += temp * pow(2, i);
            i++;
        }
        System.out.println("Decimal: " + decimal);
    }
}
