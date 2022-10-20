import java.util.Scanner;

/*
        6.	Leer tres números enteros, si el primero es negativo, calcular el producto de los tres, en caso contrario calcular la suma.
*/
public class PrimerValorNegativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        System.out.println("Ingrese valores para a, b y c: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        if (a < 0) {
            System.out.println("El producto es: " + (a * b * c));
        } else {
            System.out.println("La suma es: " + (a + b + c));
        }
    }

}
