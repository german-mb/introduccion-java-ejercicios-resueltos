import java.util.Scanner;

/*
9.	Crear un programa para convertir un número decimal a binario.
 */
public class DecimalABinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String binario = "";
        System.out.print("Ingrese un numero entero positivo: ");
        numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("Decimal: " + numero);
            while (numero != 0) {
                binario = (numero % 2 == 0 ? "0" : "1") + binario;
                numero /= 2;
            }
            System.out.println("Binario: " + binario);
        } else {
            System.out.println("Ingrese un numero positivo");
        }
    }
}
