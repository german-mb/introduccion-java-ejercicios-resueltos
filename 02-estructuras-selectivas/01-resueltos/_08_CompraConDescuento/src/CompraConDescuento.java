import java.util.Scanner;

/*
8.	DimSport realiza un 20% de descuento a los clientes cuya compra supere los $300. ¿Cuál será la cantidad que pagará una persona por su compra?
 */
public class CompraConDescuento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor_compra, precio_final = 0, descuento = 0.20;
        System.out.println("Ingrese el total de la compra: ");
        valor_compra = teclado.nextFloat();
        if (valor_compra > 300) {
            precio_final = valor_compra - valor_compra * descuento;
        } else {
            precio_final = valor_compra;
        }
        System.out.println("Monto a cancelar: $" + precio_final);
    }
}
