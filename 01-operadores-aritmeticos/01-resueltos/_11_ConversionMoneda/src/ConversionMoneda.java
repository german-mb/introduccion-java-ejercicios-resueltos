import java.util.Scanner;

/*
11.	Juana viajará a EE.UU. y luego a Europa, por tanto, requiere un programa que convierta x cantidad de moneda boliviana a dólares y a euros.
 */
public class ConversionMoneda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double bolivianos, dolares, euros;
        System.out.print("Digite la moneda boliviana: ");
        bolivianos = teclado.nextDouble();
        dolares = bolivianos / 6.90;
        euros = bolivianos / 7.79;
        System.out.println("Dolares: " + dolares);
        System.out.println("Euros: " + euros);
    }
}
