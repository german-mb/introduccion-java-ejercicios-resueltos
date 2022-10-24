import java.util.Scanner;

/*
7.	Crear un programa que lea por teclado un array de 5 números enteros y la desplace una posición: el primero pasa a ser segundo, el segundo pasa a ser tercero y así sucesivamente. El último pasa a ser primero.
 */
public class DesplazarUnaPosicion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[], numero, aux;
        arreglo = new int[5];
        System.out.println("\tINGRESE VALORES PARA EL ARREGLO");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicion " + i + ": ");
            numero = teclado.nextInt();
            arreglo[i] = numero;
        }
        System.out.println("\tARREGLO BASE");
        for (int i = 0; i < 5; i++) {
            System.out.print(arreglo[i] + " ");
        }
        aux = arreglo[4];
        for (int i = 4; i >= 0; i--) {
            if (i == 0) {
                arreglo[i] = aux;
            } else {
                arreglo[i] = arreglo[i - 1];
            }
        }
        System.out.println("\n\tARREGLO CON DESPLAZAMIENTO");
        for (int i = 0; i < 5; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
