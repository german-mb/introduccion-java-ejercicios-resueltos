import static java.lang.Character.*;
import static java.lang.Math.*;

public class MetodosPredefinidos {
    public static void main(String[] args) {
        int a = 15, b = 17;
        char c = 'l';
        //claseMath();
        claseCharacter();
        //suma(a, b);
        //System.out.println(restar(a, b));

    }

    private static int restar(int a, int b) {
        return a - b;
    }


    private static void suma(int a, int b) {
        System.out.println("La suma es: " + (a + b));
    }

    private static void claseCharacter() {
        System.out.println("isDigit (8): " + isDigit('8'));
        System.out.println("isDigit (*): " + isDigit('*'));
        System.out.println("isLetter(a): " + isLetter('a'));
        System.out.println("isLetter(*): " + isLetter('*'));
        System.out.println("isLowerCase(a): " + isLowerCase('a'));
        System.out.println("isLowerCase(A): " + isLowerCase('A'));
        System.out.println("isUpperCase(B): " + isUpperCase('B'));
        System.out.println("isUpperCase(k): " + isUpperCase('k'));
        System.out.println("toLowerCase(D): " + toLowerCase('D'));
        System.out.println("toLowerCase(*): " + toLowerCase('*'));
        System.out.println("toUpperCase(j): " + toUpperCase('j'));
        System.out.println("toUpperCase(8): " + toUpperCase('8'));
    }

    private static void claseMath() {
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
