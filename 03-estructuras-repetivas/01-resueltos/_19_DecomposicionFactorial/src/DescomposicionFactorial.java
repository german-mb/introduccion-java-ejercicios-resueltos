import java.util.Scanner;

/*
19.	Crear un programa que calcule la descomposición en factores primos de un número entero.
Por ejemplo: 20 = 2*2*5.

 */
public class DescomposicionFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, primo;
        System.out.print("Digite un numero: ");
        numero = teclado.nextInt();
        primo = 2;
        while (numero > 1) {
            if (numero % primo == 0) {
                System.out.print(primo + " ");
                numero /= primo;
            } else {
                primo++;
            }
        }
    }
}
