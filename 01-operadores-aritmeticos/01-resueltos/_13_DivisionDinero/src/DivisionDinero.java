import java.util.Scanner;

/*
13.	Ingrese N dólares para Javier. Luis tiene la mitad de lo que posee Javier. Juan tiene la mitad de lo que poseen Luis y Javier juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
public class DivisionDinero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float dls_javier, dls_luis, dls_juan, dls_total;
        System.out.print("Digite el monto que posee Javier: ");
        dls_javier = teclado.nextFloat();
        dls_luis = dls_javier / 2;
        dls_juan = (dls_javier + dls_luis) / 2;
        dls_total = dls_javier + dls_luis + dls_juan;
        System.out.println("Javier: $" + dls_javier);
        System.out.println("Luis: $" + dls_luis);
        System.out.println("Juan: $" + dls_juan);
        System.out.println("Total: $" + dls_total);
    }
}
