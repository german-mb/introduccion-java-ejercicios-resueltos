import java.util.Scanner;

/*
8.	Realizar un programa que pida ingresar una estatura en metros y luego convertir a pulgadas y centímetros.
 */
public class ConversionEstatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double estatura, estPulgadas, estCentimetros;
        System.out.print("Ingrese su estatura en metros: ");
        estatura = teclado.nextDouble();
        estPulgadas = estatura * 39.3701;
        estCentimetros = estatura * 100;
        System.out.println("En Pulgadas: " + estPulgadas);
        System.out.println("En Centimetros: " + estCentimetros);
    }
}
