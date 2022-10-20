import java.util.Scanner;

import static java.lang.Thread.sleep;


/*
14.	Escribir un programa que emule un inicio de sesión de un sistema, almacenando usuario y contraseña.
 */
public class InicioDeSesion {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        final String USERNAME = "lilian", PASSWORD = "li#4pwd";
        String user, pwd;
        System.out.println("\tINICIO DE SESION");
        System.out.print("Ingrese el nombre: ");
        user = teclado.next();
        System.out.print("Ingrese la clave: ");
        pwd = teclado.next();
        if (!user.equals(USERNAME)) {
            System.out.println("Usuario incorrecto");
        } else if (!pwd.equals(PASSWORD)) {
            System.out.println("Clave incorrecto");
        } else {
            System.out.println("Iniciando sesion... ");
            Thread.sleep(2000);
            System.out.println("Bienvenido al programa...\n");
        }
    }
}
