import java.util.Scanner;

/*
17.	Escribir un algoritmo que invierta los dígitos de un número positivo entero. Usar operadores módulo y división para ir obteniendo los dígitos uno a uno. Por ejemplo, si se ingresa 37368 debe retornar el número 86373.
 */
public class InvertirDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, nuevo_numero = 0;
        System.out.print("Digite un numero: ");
        numero = teclado.nextInt();
        while (numero > 0) {
            nuevo_numero = nuevo_numero * 10 + (numero % 10);
            numero = numero / 10;
        }
        System.out.println("Numero invertido: " + nuevo_numero);
    }
}
