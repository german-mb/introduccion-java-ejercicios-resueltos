import java.util.Scanner;

/*
3.	Crear un programa que lea por teclado dos números y que haga el intercambio de valores, luego de intercambiar mostrar por pantalla. Ejemplo: a = 10 y b = 15; realizando el cambio a = 15 y b = 10.
 */
public class IntercambiarValores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA, numB, aux;
        System.out.print("Digite un valor par a: ");
        numA = teclado.nextInt();
        System.out.print("Digite un valor par b: ");
        numB = teclado.nextInt();
        aux = numA;
        numA = numB;
        numB = aux;
        System.out.println("A: " + numA);
        System.out.println("B: " + numB);
    }
}
