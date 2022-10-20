import java.util.Scanner;

/*
9.	Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora, Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
 */
public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas_semanales, pago_semanal;
        System.out.print("Digite las horas semanales trabajadas: ");
        horas_semanales = teclado.nextInt();
        if (horas_semanales <= 40) {
            pago_semanal = horas_semanales * 16;
        } else {
            pago_semanal = 640 + ((horas_semanales - 40) * 20);
        }
        System.out.println("Salario semanal: $" + pago_semanal);

    }
}
