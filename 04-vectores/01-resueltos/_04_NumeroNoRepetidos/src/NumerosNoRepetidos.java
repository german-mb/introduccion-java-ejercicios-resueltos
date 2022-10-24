import java.util.Scanner;

/*
4.	Escribir un programa que pida 5 números enteros y en caso de que se introduzca un número repetido se advierta al usuario y vuelva a pedir un nuevo número, después mostrar los elementos por pantalla.
 */
public class NumerosNoRepetidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, numeros[];
        boolean existe = false;
        numeros = new int[5];
        System.out.println("\tINGRESE VALORES AL ARREGLO");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicion " + i + ": ");
            numero = teclado.nextByte();
            do {
                for (int j = 0; j <= i; j++) {
                    if (numero == numeros[j]) {
                        existe = true;
                        System.out.print("Digite otro numero: ");
                        numero = teclado.nextInt();
                        break;
                    } else {
                        existe = false;
                    }
                }
            } while (existe);
            numeros[i] = numero;
            existe = false;
        }
        System.out.println("\n\tARREGLO SIN VALORES REPETIDOS");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
    }
}
