import java.util.Scanner;

/*
12.	Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, multiplicación y división) con valores numéricos enteros. El usuario debe especificar la operación con el primer carácter: S o s para la suma, R o r para la resta, M o m para la multiplicación y D o d para la división.
 */
public class CalculadoraOperaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        char operacion;
        System.out.println("Digite dos valores: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        System.out.println("Digite la opcion: " +
                "\n\ts o S: Sumar" +
                "\n\tr o R: Restar" +
                "\n\tm o M: Multiplicar" +
                "\n\td o D: Dividir");
        operacion = teclado.next().charAt(0);
        switch (Character.toLowerCase(operacion)) {
            case 's':
                System.out.println(a + " + " + b + " = " + (a / b));
                break;
            case 'r':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case 'm':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case 'd':
                if (b == 0) {
                    System.out.println("No se pudo efectuar la division");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            default:
                System.out.println("Opcion NO valida");
                break;
        }
    }
}
