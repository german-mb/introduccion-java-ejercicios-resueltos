import java.util.Scanner;

/*
16.	Desarrolle un programa que grafique los largos y sus respectivos valores de la secuencia de Collatz de un número n.
 */
public class SecuenciaCollatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, pasos = 0;
        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();
        while (num != 1) {
            pasos++;
            for (int i = 0; i < num; i++) System.out.print("*");
            System.out.println(" " + num);
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            if (num == 1) {
                System.out.print("* " + num);
            } else {
                System.out.print("");
            }
        }
    }
}
