import java.util.Scanner;

/*
7.	Crear un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo. Si se ingresa el número 9 debe mostrar la siguiente figura:
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
*/
public class TrianguloNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Digite un numero impar: ");
        num = teclado.nextInt();
        figura(num);
    }

    private static void figura(int num) {
        if (num % 2 != 0) {
            for (int i = 1; i <= num; i += 2) {
                for (int j = i; j >= 1; j -= 2) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Debe ingrsar un numero impar");
        }
    }
}
