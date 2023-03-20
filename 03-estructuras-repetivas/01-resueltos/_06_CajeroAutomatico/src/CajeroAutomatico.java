import java.util.Scanner;

/*
6.	Hacer un programa que simule un cajero automático con saldo inicial de $1000, con el siguiente menú de opciones:
    1.	Ingresar dinero a la cuenta.
    2.	Retirar dinero de la cuenta.
    3.	Salir.
El cajero no puede tener menos de $100 en la cuenta.
 */
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int saldo = 1000, movimiento, opcion;
        do {
            System.out.println("\n\t\tCAJERO AUTOMATICO");
            System.out.println("\tSALDO ACTUAL $" + saldo +
                    "\n\t1. DEPOSITAR" +
                    "\n\t2. RETIRAR" +
                    "\n\t3. SALIR\n");
            System.out.print("Ingrese una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("MONTO A DEPOSITAR: ");
                    movimiento = teclado.nextInt();
                    if (movimiento > 0) {
                        saldo += movimiento;
                        System.out.println("Deposito exitoso");
                    } else {
                        System.out.println("El monto a depositar tiene que ser mayor a cero");
                    }
                    break;
                case 2:
                    System.out.print("DIGITE EL MONTO A RETIRAR: ");
                    movimiento = teclado.nextInt();
                    if (movimiento > 0) {
                        if (saldo - movimiento >= 100) {
                            saldo -= movimiento;
                            System.out.println("Retiro exitoso");
                        } else {
                            System.out.println("No tiene suficiente SALDO para completar esta accion");
                        }
                    } else {
                        System.out.println("El monto a retirar tiene que ser mayor a cero");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        } while (opcion != 3);
        System.out.println("\tGRACIAS POR SU PREFERENCIA");
    }
}
