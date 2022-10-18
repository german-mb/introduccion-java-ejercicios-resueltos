import java.util.Scanner;

/*
15.	Dado un número total de horas, devuelve el número de semanas, días y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */
public class TotalHoras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas_ingresadas, semanas, dias, horas;
        System.out.print("Digite el numero de horas: ");
        horas_ingresadas = teclado.nextInt();
        semanas = horas_ingresadas / 168;
        dias = horas_ingresadas % 168 / 24;
        horas = horas_ingresadas % 24;
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
    }
}
