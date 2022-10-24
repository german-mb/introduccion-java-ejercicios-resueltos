import java.util.Scanner;

/*
5.	Leer por teclado dos arreglos de 5 números enteros y mezclarlas en una tercera de la forma que: el 1 de A, el 1 de B, el 2 de A, el 2 de B, etc.
 */
public class MezclarArreglos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arregloA[], arregloB[], arregloC[], numero, posA = 0, posB = 0;
        arregloA = new int[5];
        arregloB = new int[5];
        arregloC = new int[10];
        System.out.println("Ingrese valores para arreglo A");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicion " + (i + 1) + ": ");
            numero = teclado.nextInt();
            arregloA[i] = numero;
        }
        System.out.println("Ingrese valores para arreglo B");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicion " + (i + 1) + ": ");
            numero = teclado.nextInt();
            arregloB[i] = numero;
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                arregloC[i] = arregloA[posA];
                posA++;
            } else {
                arregloC[i] = arregloB[posB];
                posB++;
            }
        }
        System.out.println("\tARREGLO C");
        for (int i = 0; i < 10; i++) {
            System.out.print(arregloC[i] + " ");
        }
    }
}
