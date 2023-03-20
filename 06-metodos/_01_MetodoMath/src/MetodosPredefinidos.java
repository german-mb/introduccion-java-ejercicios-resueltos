import static java.lang.Math.*;
public class MetodosPredefinidos {
    public static void main(String[] args) {
        double num1 = 4.5, num2 = 3;
        System.out.println("Valor absoluto: " + abs(num1));
        System.out.println("Redondeo con ceil: " + ceil(num1));
        System.out.println("Coseno: " + cos(num1));
        System.out.println("Exponente: " + exp(num1));
        System.out.println("Redondeo con floor: " + floor(num1));
        System.out.println("Logaritmo: " + log(num1));
        System.out.println("Numero mayor: " + max(num1, num2));
        System.out.println("Numero menor: " + min(num1, num2));
        System.out.println("Exponente n: " + pow(num1, num2));
        System.out.println("Seno: " + sin(num1));
        System.out.println("Raiz Cuadrada: " + sqrt(num1));
        System.out.println("Tangente: " + tan(num1));
    }
}
