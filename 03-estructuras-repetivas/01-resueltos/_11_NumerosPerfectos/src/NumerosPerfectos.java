/*
11. Escribir un programa que muestre los números perfectos entre 1 y 1000.
Numero perfecto es igual a la suma de sus divisores.
6 => 1 + 2 + 3 = 6
20 => 1 + 2 + 4 + 7 + 14 = 28
 */
public class NumerosPerfectos {
    public static void main(String[] args) {
        int suma_divs = 0;
        for (int i = 1; i <= 1000; i++) {
            suma_divs = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    suma_divs += j;
                }
            }
            if (i == suma_divs) {
                System.out.print(i + " ");
            } else {
                System.out.print("");
            }

        }
    }
}
