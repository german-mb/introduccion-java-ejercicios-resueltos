import java.util.Scanner;

/*
1.	Se requiere un programa para verificar si un ciudadano está habilitado para sufragar en las elecciones. Sólo los que tienen 18 años o mayores a 18 años pueden participar.
 */
public class MayorDeEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Esta habilitado para sufragar");
        } else {
            System.out.println("NO esta habilitado para sufragar");
        }
    }
}
