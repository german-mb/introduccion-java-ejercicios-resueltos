import java.util.Scanner;

/*
1.	Realizar un programa que solicite al usuario un número entero entre 1 – 100. El programa debe generar un número aleatorio en ese mismo rango, e indicarle al usuario si el número que digitó es menor o mayor al número aleatorio, así hasta que adivine; y por último mostrar el número de intentos.
 */
public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String titulo = "\n\tADIVINA EL NUMERO ENTRE 1 - 100";
        int aleatorio, numero = 0, intentos = 0;
        System.out.println(titulo);
        aleatorio = (int) (Math.random() * 100 + 1);
        while (numero != aleatorio) {
            intentos++;
            System.out.print("Digita un numero: ");
            numero = teclado.nextInt();
            if (numero == aleatorio) {
                System.out.println("\nFELICIDADES LOGRASTE ADIVINAR!!");
                System.out.println("INTENTOS: " + intentos);
            } else if (numero > aleatorio) {
                System.out.println("Es menor");
            } else {
                System.out.println("Es mayor");
            }
        }
    }
}
