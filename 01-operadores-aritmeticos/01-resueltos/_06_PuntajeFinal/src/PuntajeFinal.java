import java.util.Scanner;

/*
6.	Se necesita elaborar un programa que solicite el número de respuestas correctas, incorrectas y en blanco de un estudiante, y muestre el puntaje final considerando que por cada respuesta correcta tendrá 3 puntos, respuestas incorrectas tendrá -1 y respuestas en blanco tendrá 0.
 */
public class PuntajeFinal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int respCorrectas, respIncorrectas, respBlancos, puntajeFinal;
        System.out.print("Degite la cantidad de respuestas correctas: ");
        respCorrectas = teclado.nextInt();
        System.out.print("Degite la cantidad de respuestas incorrectas: ");
        respIncorrectas = teclado.nextInt();
        System.out.print("Degite la cantidad de respuestas en blanco: ");
        respBlancos = teclado.nextInt();
        puntajeFinal = (respCorrectas * 3) - respIncorrectas;
        System.out.println("Puntaje final es: " + puntajeFinal);
    }
}
