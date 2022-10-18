import java.util.Scanner;

/*
2.	Realizar un programa para calcular el resultado de la siguiente expresión matemática:
a+(b/(c-d))=

 */
public class ExpresionMatematica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a, b, c, d, resultado = 0;
        System.out.println("Ingrese valores para a, b, c y d: ");
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        d = teclado.nextFloat();
        resultado = a + (b / (c - d));
        System.out.println("El resultado es: " + resultado);
    }
}
