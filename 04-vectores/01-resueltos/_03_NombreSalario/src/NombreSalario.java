import java.util.Scanner;

/*
3.	Leer el nombre y sueldo de 5 empleados y mostrar el nombre y sueldo del empleado que más gana.
 */
public class NombreSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sueldo, sueldos[], sueldo_mayor = 0;
        String nombre, nombres[];
        int pos_mayor = 0;
        sueldos = new float[5];
        nombres = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Empleado " + (i + 1)+", nombre: ");
            nombre = teclado.next();
            System.out.print("Empleado " + (i + 1)+", sueldo: ");
            sueldo = teclado.nextFloat();
            nombres[i] = nombre;
            sueldos[i] = sueldo;
            if (sueldo > sueldo_mayor) {
                sueldo_mayor = sueldo;
                pos_mayor = i;
            }
        }
        System.out.println("\tMAYOR SALARIO");
        System.out.println("NOMBRE: " + nombres[pos_mayor]);
        System.out.println("SALARIO: $" + sueldos[pos_mayor]);
    }
}
