import java.util.Scanner;

/*
5.	Escribir un programa que pregunte el precio, el tanto por ciento de descuento, y muestre el precio con descuento. Por ejemplo, si el precio que introduce el usuario es 300 y el descuento 20, el programa mostrará el precio final con descuento es de 240.
 */
public class PrecioConDescuento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio, descuento, precioFinal;
        System.out.print("Ingrese el valor del producto: ");
        precio = teclado.nextInt();
        System.out.print("Ingrese el porcentaje de descuento: ");
        descuento = teclado.nextInt();
        precioFinal = precio - (precio * (descuento / 100));
        System.out.println("El precio con descuento es: " + precioFinal);
    }
}
