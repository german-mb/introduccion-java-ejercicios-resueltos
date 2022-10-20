import java.util.Scanner;

/*
10.	Pedir tres números y ordenar de mayor a menor.
 */
public class MayorAMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, mayor, medio, menor;
        System.out.println("Ingrese valores para a, b y c: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        if (a > b && a > c) {
            mayor = a;
        } else if (b > a && b > c) {
            mayor = b;
        } else {
            mayor = c;
        }
        if (a < b && a < c) {
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        } else {
            menor = c;
        }
        medio = (a + b + c) - mayor - menor;
        System.out.println("De mayor a menor: ");
        System.out.println(mayor);
        System.out.println(medio);
        System.out.println(menor);
    }
}
