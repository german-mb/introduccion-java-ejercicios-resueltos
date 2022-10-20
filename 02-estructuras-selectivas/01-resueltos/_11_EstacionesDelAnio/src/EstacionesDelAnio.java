import java.util.Scanner;

/*
11.	Desarrollar un programa de acuerdo a la fecha que capture, devuelva en que estación del año está la fecha indicada.
 */
public class EstacionesDelAnio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes;
        String estacion = "LA FECHA INGRESADA NO ES VALIDA";
        System.out.print("Digite el dia entre 1 - 30: ");
        dia = teclado.nextInt();
        System.out.print("Digite los meses entre 1 - 12: ");
        mes = teclado.nextInt();
        String s = (dia >= 21 && dia <= 30 && (mes >= 3 && mes < 6)) || (dia < 21 && (mes > 3 && mes <= 6))
                ? estacion = "OTONIO"
                : (dia >= 21 && dia <= 30 && mes >= 6 && mes < 9) || (dia < 21 && (mes > 6 && mes <= 9))
                ? estacion = "INVIERNO"
                : (dia >= 21 && dia <= 30 && (mes >= 9 && mes < 12)) || (dia < 21 && (mes > 9 && mes <= 12))
                ? estacion = "PRIMAVERA"
                : (dia >= 21 && dia <= 30 && mes == 12 && mes == 12) ||
                (dia < 21 && mes <= 3 || dia >= 21 && dia <= 30 && mes < 3)
                ? estacion = "VERANO"
                : "";
        System.out.println(estacion);
    }
}
