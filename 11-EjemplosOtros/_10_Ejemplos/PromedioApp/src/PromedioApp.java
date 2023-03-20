import java.util.Scanner;

public class PromedioApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimen;
        double PI = 3.1415;
        int cast = (int) PI;
        System.out.println("\tPROMEDIO APP v1.0");
        System.out.print("Digite la cantidad de valores a ingresar: ");
        dimen = teclado.nextInt();
        if (dimen <= 0) {
            System.out.println("No se pudo crear el arreglo");
        } else {
            int data[] = new int[dimen];
            for (int i = 0; i < dimen; i++) {
                System.out.print("Valor " + (i + 1) + " : ");
                data[i] = teclado.nextInt();
            }
            System.out.println("El promedio es: " + promedio(data));
        }
    }


    private static int promedio(int[] data) {
        int average = 0;
        int dimen = data.length;
        for (int i = 0; i < dimen; i++)
            average += data[i];
        
        return average / dimen;
    }
}
