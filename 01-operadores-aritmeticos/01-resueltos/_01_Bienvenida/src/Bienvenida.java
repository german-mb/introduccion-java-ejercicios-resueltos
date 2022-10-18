import java.util.Scanner;
/*
1.	Crear un programa que pida un nombre y muestre por pantalla: “Hola nombre, bienvenido al curso”.
 */

public class Bienvenida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Bienvenid@ " + nombre + ", al curso de Java");
    }
}
