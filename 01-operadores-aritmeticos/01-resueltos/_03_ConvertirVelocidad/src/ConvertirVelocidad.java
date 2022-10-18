import java.util.Scanner;

/*
3.	Realizar un programa que lea una determinada velocidad de km/h, luego convierta a m/s.
 */
public class ConvertirVelocidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float velocidadKm, velocidadMetros;
        System.out.print("Ingrese una velocidad en km/h: ");
        velocidadKm = teclado.nextFloat();
        velocidadMetros = (velocidadKm * 1000) / 3600;
        System.out.println("La velocidad en m/s es: " + velocidadMetros);
    }
}
