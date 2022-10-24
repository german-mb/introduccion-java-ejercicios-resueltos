import java.util.Scanner;

/*
16.	Crear un programa que calcule x^y donde x como y son números enteros positivos. No utilizar la función pow.
 */
public class ExponeneteN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, exponente, resultado;
        System.out.print("Digite la base: ");
        base = teclado.nextInt();
        System.out.print("Digite el exponente: ");
        exponente = teclado.nextInt();
        resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println("El resultado: " + resultado);
    }
}
