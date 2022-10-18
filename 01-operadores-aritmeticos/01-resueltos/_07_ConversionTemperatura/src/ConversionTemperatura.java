import java.util.Scanner;

/*
7.	Escribir un programa para convertir grados Centígrados (°C) a grados Fahrenheit (°F). F=(C*1.8) +32.
 */
public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.print("Ingrese los grados centigrados: ");
        gradosC = teclado.nextDouble();
        gradosF = (gradosC * 1.8) + 32;
        System.out.println("Grados Fahrenheit: " + gradosF);
    }
}
