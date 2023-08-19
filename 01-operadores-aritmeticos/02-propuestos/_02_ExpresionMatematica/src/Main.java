
/*
02. Crear un programa que calcule el resultado de la siguiente expresión
matemática:

((a+b)/c)/(d+e/f)=
 */
public class Main {
    public static void main(String[] args) {

        float a = 3, b = 9, c = 3, d = 2, e = 6, f = 3;
        float result = ((a + b) / c) / (d + e / f);
        System.out.println(result);
    }
}