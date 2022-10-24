import java.util.Scanner;

/*
7.	Realizar un programa para verificar si un número es primo o no.
 */
public class EsPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        boolean primo = true;
        System.out.print("Digite un numero: ");
        numero = teclado.nextInt();
        if (numero > 1) {
            for (int i = 2; i < numero && primo == true; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
            System.out.println(primo ? numero + " es primo"
                    : numero + " no es primo");
        } else {
            System.out.println(" no es un numero primo.");
        }
    }
}
