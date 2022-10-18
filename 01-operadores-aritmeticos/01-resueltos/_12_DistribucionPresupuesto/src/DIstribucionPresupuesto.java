import java.util.Scanner;

/*
12.	Se tiene un x monto de dinero por concepto de presupuesto del año de un Instituto, estas serán entregadas de la siguiente forma: Para Sistemas 20%, Administración 30%, contaduría 25% y el resto para Secretariado.
 */
public class DIstribucionPresupuesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sis, admin, conta, secre, presupuesto;
        System.out.print("Digite el presupuesto total: ");
        presupuesto = teclado.nextDouble();
        sis = presupuesto - (presupuesto * .80);
        admin = presupuesto - (presupuesto * .70);
        conta = presupuesto - (presupuesto * .75);
        secre = presupuesto - sis - admin - conta;
        System.out.println("Sistemas: " + sis);
        System.out.println("Administracion: " + admin);
        System.out.println("Contaduria: " + conta);
        System.out.println("Secretariado: " + secre);

    }
}
