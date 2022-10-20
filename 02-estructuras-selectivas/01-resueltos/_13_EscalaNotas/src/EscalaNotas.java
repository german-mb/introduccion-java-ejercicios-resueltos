import java.util.Scanner;

/*
13.	Pedir una nota entre 0 y 100 incluidos, mostrar con las siguientes observaciones:
•	1 – 50 necesita apoyo,
•	51 – 60 suficiente,
•	61 – 75 bueno,
•	76 – 95 notable,
•	96 – 100 excelente.

 */
public class EscalaNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float calificacion;
        String observacion = "Calificacion fuera de rango";
        System.out.print("Ingrese la calificacion: ");
        calificacion = teclado.nextFloat();
        if (calificacion >= 0 && calificacion <= 50)
            observacion = "Necesita apoyo";
        if (calificacion >= 51 && calificacion <= 60)
            observacion = "Suficiente";
        if (calificacion >= 61 && calificacion <= 75)
            observacion = "Bueno";
        if (calificacion >= 76 && calificacion <= 95)
            observacion = "Notable";
        if (calificacion >= 96 && calificacion <= 100)
            observacion = "Excelente";
        System.out.println("Observacion: " + observacion);
    }
}
