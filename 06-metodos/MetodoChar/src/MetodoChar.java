import static java.lang.Character.*;
import static java.lang.Character.toUpperCase;
public class MetodoChar {
    public static void main(String[] args) {
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
}
