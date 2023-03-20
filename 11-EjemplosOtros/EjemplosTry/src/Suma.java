import javax.swing.*;
public class Suma {
    public static void main(String[] args) throws Exception {
        int a, b;
        try {
            a = Integer.parseInt(JOptionPane
                    .showInputDialog("Digite un numero"));
            b = Integer.parseInt(JOptionPane
                    .showInputDialog("Digite otro número"));
            System.out.println("La suma es: " + suma(a, b));
        } catch (NumberFormatException e) {
            System.out.println("No es posible realizar la operación");
        }
    }

    private static int suma(int a, int b) {
        return a + b;
    }
}
