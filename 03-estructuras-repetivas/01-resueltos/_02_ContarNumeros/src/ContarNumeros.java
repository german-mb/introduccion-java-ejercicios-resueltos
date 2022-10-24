import java.util.Scanner;

/*
2.	Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se ingresaron.
 */
public class ContarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, contador = 0;
        System.out.print("Digite un numero: ");
        numero = teclado.nextInt();
        while (numero >= 0) {
            contador++;
            System.out.print("Digite un numero: ");
            numero = teclado.nextInt();
        }
        System.out.println("\nNumeros digitados: " + contador);
    }
}
