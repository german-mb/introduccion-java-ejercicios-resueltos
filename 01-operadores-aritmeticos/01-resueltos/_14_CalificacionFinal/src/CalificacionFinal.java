import java.util.Scanner;

/*
14.	La calificación final de un estudiante de informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25%, y 40%. Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
 */
public class CalificacionFinal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double participacion, parcial1, parcial2, examen_final, nota_final;
        System.out.print("Nota Participacion: ");
        participacion = teclado.nextFloat();
        System.out.print("Nota Parcial 1: ");
        parcial1 = teclado.nextFloat();
        System.out.print("Nota Parcial 2: ");
        parcial2 = teclado.nextFloat();
        System.out.print("Nota Examen Final: ");
        examen_final = teclado.nextFloat();
        nota_final = (participacion * .10) + (parcial1 * .25) + (parcial2 * .25) + (examen_final * .40);
        System.out.println("Nota final: " + nota_final);
    }

}
