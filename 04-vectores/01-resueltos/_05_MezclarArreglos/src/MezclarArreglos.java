import java.util.Scanner;

/*
5.	Leer por teclado dos arreglos de 5 números enteros y mezclarlas en una tercera de la forma que: el 1 de A, el 1 de B, el 2 de A, el 2 de B, etc.
 */
public class MezclarArreglos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arregA[], arregB[], arregC[], num, posA = 0, posB = 0;
        arregA = new int[3];
        arregB = new int[3];
        arregC = new int[6];
        System.out.println("Ingrese valores para arreglo A");
        for (int i = 0; i < 3; i++) {
            System.out.print("Posicion " + (i + 1) + ": ");
            num = teclado.nextInt();
            arregA[i] = num;
        }
        System.out.println("Ingrese valores para arreglo B");
        for (int i = 0; i < 3; i++) {
            System.out.print("Posicion " + (i + 1) + ": ");
            num = teclado.nextInt();
            arregB[i] = num;
        }
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                arregC[i] = arregA[posA];
                posA++;
            } else {
                arregC[i] = arregB[posB];
                posB++;
            }
        }
        System.out.println("\tARREGLO C");
        for (int i = 0; i < 6; i++) {
            System.out.print(arregC[i] + " ");
        }
    }
}
