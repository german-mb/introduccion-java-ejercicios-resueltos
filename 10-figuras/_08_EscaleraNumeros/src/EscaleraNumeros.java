import java.util.Scanner;

/*
8.	Realizar un programa que pida al usuario y que genere una escalera de números hasta el número ingresado. Ejemplo luego de ingresar el numero 7, debe mostrar el siguiente patron:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
*/
public class EscaleraNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Digite un numero: ");
        num = teclado.nextInt();
        figura(num);
    }

    private static void figura(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
